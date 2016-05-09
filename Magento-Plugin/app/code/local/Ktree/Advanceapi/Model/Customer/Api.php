<?php
class Ktree_Advanceapi_Model_Customer_Api extends Mage_Customer_Model_Customer_Api
{
    
	public function getAllIds($filters = array()) 
	{
			$collection =  Mage::getModel('customer/customer')->getCollection();
			try {
				foreach ($filters as $field => $value) {
					$collection->addFieldToFilter($field, $value);
				}
			} catch (Mage_Core_Exception $e) {
				$this->_fault('filters_invalid', $e->getMessage());
			}
			$allIds = $collection->getAllIds();
			$result['customer_count'] = count($allIds);
			$result['customer_ids'] = $allIds;
			return $result;
	}
	public function itemslist($customerIds)
    {  
        $collection = Mage::getModel('customer/customer')->getCollection()
            ->addAttributeToSelect('*')
            ->addAttributeToFilter('entity_id', array(
                       'in' => $customerIds
                   ));
		$result = array();
        foreach ($collection as $customer) {
            $data = $customer->toArray();
            $row  = array();
			foreach ($this->_mapAttributes as $attributeAlias => $attributeCode) {
                $row[$attributeAlias] = (isset($data[$attributeCode]) ? $data[$attributeCode] : null);
            }

            foreach ($this->getAllowedAttributes($customer) as $attributeCode => $attribute) {
                    $row[$attributeCode] = $data[$attributeCode];
            }
			$row['address_count'] = count($customer->getAddresses());
			foreach ($customer->getAddresses() as $address) {
				$data1 = $address->toArray();
				$street=$address->getData('street');
				$row1  = array();
				$data1['customer_id']=$address->getData('customer_id');
				$data1['customer_address_id']=$address->getId();
				$data1['created_at']=$address->getData('created_at');
				$data1['updated_at']=$address->getData('updated_at');
				$data1['firstname']=$address->getData('firstname');
				$data1['lastname']=$address->getData('lastname');
				$data1['city']=$address->getData('city');
				$data1['region']=$address->getData('region');
				$data1['region_id']=$address->getData('region_id');
				$data1['country_id']=$address->getData('country_id');
				$data1['telephone']=$address->getData('telephone');
				$data1['street']=$street;
				$data1['middlename']=$address->getData('middlename');
				$data1['prefix']=$address->getData('prefix');
				$data1['suffix']=$address->getData('suffix');
				$data1['postcode']=$address->getData('postcode');
				$data1['company']=$address->getData('company');
				$data1['fax']=$address->getData('fax');
				$data1['incemented_id']=$address->getData('incemented_id');
				$data1['vat_id']=$address->getData('vat_id');
				$data1['vat_is_valid']=$address->getData('vat_is_valid');
				$data1['vat_request_date']=$address->getData('vat_request_date');
				$data1['vat_request_id']=$address->getData('vat_request_id');
				$data1['vat_request_success']=$address->getData('vat_request_success');
				$data1['is_default_billing'] = $customer->getDefaultBilling() == $address->getId();
				$data1['is_default_shipping'] = $customer->getDefaultShipping() == $address->getId();
				$data1['is_default_billing'] = $customer->getDefaultBilling() == $address->getId();
				$data1['is_default_shipping'] = $customer->getDefaultShipping() == $address->getId();
				$row1[]=$data1;
				$row['addresses'] = $row1;

			}
			$result[] = $row;
        }
		return $result;
    }
}
