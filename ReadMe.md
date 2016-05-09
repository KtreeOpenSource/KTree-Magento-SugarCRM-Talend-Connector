Talend Magento2_SugarCRM Customers Sync. 
----------------------------------------
  A Talend Connector to Sync Data between Magento and SugarCRM.

Site Link: www.ktree.com

Tested Environment:
-------------------

Magento Plugin : Magento 1

Prerequisites:
--------------

JRE Supported By Talend : 1.6 , 1.7 

Note : JAVA 8 doesn't support by Talend As of Now.

  * We need JRE support to run Talend Jobs
  
The following are the steps to configure JRE in Windows/Linux:

  		#######	Installing and Configuring Jre 1.7 in Linux  ########

        Installing JRE 1.7 
		
		1.sudo apt-get update
		2.sudo apt-get install openjdk-7-jre
		3.java -version

		Configuring JRE 1.7 :-
		
		1.sudo vim /etc/profile
		2.Depending on where you installed your Java, you will need to provide the full path. For this example, I installed Oracle JDK 7 in the /usr/lib/jvm/java-7-oracle directory.
		
		Scroll to the end of the file and enter the following:
		
		JAVA_HOME=/usr/lib/jvm/java-7-oracle
		export JAVA_HOME

		3.reload the system PATH with the following command:

		$ . /etc/profile

        4.Test it by executing:

	      echo $JAVA_HOME

  	Installing and Configuring JRE 1.7 in Windows:
	-----------------------------------------------

	* Find If Windows 8 is 32-bit or 64-bit.

		Control Panel-->System and Security-->System and then looking at System Type Properties.

    * Download correct JDK 7 installer from Java download sites

       http://www.oracle.com/technetwork/java/javase/downloads/index.html

    * Install JDK by double clicking on Windows installer

	To set the JAVA_HOME variable:
		Find out where Java is installed. If you didn't change the path during installation, it will be something like this:
		
		C:\Program Files\Java\jdk1.7
		
	In Windows 7 right click My Computer and select Properties > Advanced.
	In Windows 8 go to Control Panel > System > Advanced System Settings. 
	  
	  * Click the Environment Variables button. 
	  * Under System Variables, click New. In the Variable Name field, enter: 
	
	  JAVA_HOME if you installed the JDK (Java Development Kit)
	  or 
	  JRE_HOME if you installed the JRE (Java Runtime Environment)  
	
	In the Variable Value field, enter your JDK or JRE installation path.
	If the path contains spaces, use the shortened path name, for example C:\Progra~1\Java\jdk1.7) 

  
Installing magento-plugin before running Talend Job:  
-------------------------------------------------------
  Grab the folder "Magento-plugin" from github repository and install in your magento instance.
  
  Upload "app" folder inside Magento instance as stated below.
  
 1. Login to Magento admin Panel 
 2. Go to System -> Magento Connect -> Magento Connect Manager
 3. Login into Magento Connect Manager
 4. Upload the provided "app" folder and Click on Upload
 5. After Successful installation goto System-> Cache Management in admin and Flush all Caches
 6. You are done with plugin installation.
 
 Using API:
 ---------
  Find the following methods In order to pull customer information.
  
  To get List of Customer Id's:
  -----------------------------
  
  $allCustomerIds = $soap->call($sessionID,"advanceapi_customer.getAllIds");

  Customer Information :
  ----------------------
  
  $allCustomers = $soap->call($sessionID,"advanceapi_customer.itemslist",array($allCustomerIds)); 

installing and Running Job:
-----------------------------
  
  1. First Extract the given bundle to any of your system directory windows/Linux you can find a folder called "Magento2SugarCRM"
  2. Once Extracted there you will find plugin.properties file with following parameters.
  3. Fill up with your Server Credentials(Magento,SugarCRM and Email server details) .
  
  property file configuration :
  ------------------------------
        ####Magento#####
		MagentoURL=<Magento instance url > (http://<ip>:<port>/index.php)
		MagentoAPIUser=<Magento API UserName>(Talend_user) and
		MagentoAPIPassword=<Magento API password>(Talend123)
		MagentoCustomerCount=<Magento customer Sublist count for dividing Main Customers list and syncing the customers iteratively for example if Main customer list is 100 then MagentoCustomerCount=10 then 10 customers are synced iterating>(10)
        
		######SugarCRM#####
		SugarCRMURL=<SugarCRM instance URL>(http://<ip>:<port>/soap.php)
		SugarCRMUser=<SugarCRM username>(admin)
		SugarCRMPassword=<SugarCRM Pasword>

		##### SMTP Configurations #####
		emailSmtpHost=<Email Host name>
		emailSmtpPort=<SMTP Port Number>(465 if gmail.)
		emailSmtpUsername=<SMTP USer name>  (username)
		emailSmtpPassword=<SMTP User Password> (password)
		setTo=<To Address>
		setCc=<CC Address>
		setBcc=<BCC Address>
		setFrom=<From Address>
   
   4.  Configuring Job in Linux:
       -------------------------
	   
	   Go to Sh file path in the given connector.
	   
	    "KTree-Magento2SugarCRM-Talend-Connector/Magento2SugarCRM/Magento2SugarCRMSync/Magento2SugarCRMSync_run.sh"
	   
		./Magento2SugarCRMSync_run.sh --context_param PropertyFilePath='/<directory of plugin file>/Plugin.properties'  --context_param MagentoConnectionTimeOut= 240 --context_param MagentoReadTimeout=360000
		  
		  (or)
		  
		  sh Magento2SugarCRMSync_run.sh --context_param PropertyFilePath='/<directory of plugin file>/Plugin.properties'  --context_param MagentoConnectionTimeOut= 240 --context_param MagentoReadTimeout=360000

		 ./Magento2SugarCRMSync_run.sh --       .sh file 
		 --context_param PropertyFilePath --    Dynamically adding properties to job using external file supplying to Talend job.
		                                        Enter the property file path.
												
		 MagentoReadTimeout= <Magento time specifying to exit job when magento does not respond in given time in MilliSeconds > (360000) .
         MagentoConnectionTimeOut=<Magento time specifying to exit job when magento does not connect and server our requests in given time in Seconds > (240) .

		Configuring Job in Windows:
		----------------------------
		  Magento2SugarCRMSync_run.bat --context_param PropertyFilePath='/<directory of plugin file>/Plugin.properties'  --context_param MagentoConnectionTimeOut= 240 --context_param MagentoReadTimeout=360000
		
		Scheduling jobs in linux Using Cron-tab: (as root user , type crontab -e and add the following line and save it)
		------------------------------------------
		 
		* * * * * sh Magento2SugarCRMSync_run.sh --context_param PropertyFilePath='/<directory of plugin file>/Plugin.properties'  --context_param MagentoConnectionTimeOut= 240 --context_param MagentoReadTimeout=360000
		
		The above Job will run every minute to sync customers from Magento to SugarCRM.
		
 
    5.  We can run Manually by executing .bat/.sh file based on your paltform with specified parameters.

Features :
----------

1. Added Custom Magento Plugin in order to Simplify Customer details fetching through SOAP API.
2. Pure Web Services based connector .
3. Well Exception handling mechanisms and mail triggers after completion of job ,if any exception occurs.
4. Can add details like Magento and SugarCRM configurations through property file .
5. Can connect to any instance by simply configuring property file .
6. Can schedule job periodically either in windows/Linux.
7. Job Will fetch Magento Customers based on the count we have provided in plugin file(MagentoCustomerCount). It will break Huge list Customers  in to specified
   count at each time so that hits will reduce to magento server.
   
   Suppose we have 100 customers in Magento I want these customers on SugarCRM . So I will give "MagentoCustomerCount=10" So now job will perform 10 records
   Sync at a time to SugarCRM.

   


