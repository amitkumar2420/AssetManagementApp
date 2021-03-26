# AssetManagementApp
Capgemini Sprint 1 Projecct


## Admin 
### Users

SNo : 1
Name : GetUserById
METHOD : GET
URL : http://localhost:8090/admin/users/get/1
RESPONSE :
```json
{
	"userName": "WHMGR11",
	"userPassword": "1234",
	"userType": "WHMGR" 
}		
```
		
RESPONSE CODE: 200 OK

SNo : 2
Name : GetUsers
METHOD : GET
URL : http://localhost:8090/admin/users/get/all
RESPONSE :
```json
[
 {
 "userId": 1,
 "userName": "WHMGR1",
 "userPassword": "123",
 "userType": "WHMGR"
 },

 {
 "userId": 2,
 "userName": "WHMGR2",
 "userPassword": "321",
 "userType": "WHMGR"

 }
] 
```
RESPONSE CODE: 200 OK

SNo : 3
Name : createUser
METHOD : POST
URL : http://localhost:8090/admin/users
REQUEST BODY :
```json
{

 "userName": "WHMGR11",
 "userPassword": "1234",
 "userType": "WHMGR"
 
 }		
```
RESPONSE :
```json
{
 "userId": 17,
 "userName": "WHMGR11",
 "userPassword": "1234",
 "userType": "WHMGR"
 
 }		
```
		
RESPONSE CODE: 201 CREATED


SNo : 4
Name : modifyUser
METHOD : PUT
URL : http://localhost:8090/admin/users/modify/1
REQUEST BODY :
```json
{

 "userName": "WHMGR11",
 "userPassword": "12345",
 "userType": "WHMGR"

}		
```
RESPONSE :
```json
{

 "userName": "WHMGR11",
 "userPassword": "12345",
 "userType": "WHMGR"

}		
```
		
RESPONSE CODE: 200 OK #change

SNo : 5
Name : deleteUserById
METHOD : DELETE
URL : http://localhost:8090/admin/users/
RESPONSE :
```json
User Deleted		
```
RESPONSE CODE: 200 OK

### Asset

SNo : 1
Name : getAssetById
METHOD : GET
URL : http://localhost:8090/admin/assets/get/5
RESPONSE :
```json
{
 "assetId": 5,
 "warehouse": {
 "whId": 1,
 "mgrId": 1,
 "address": {
 "location": "Chennai",
 "subLocation": "Velacherry",
 "state": "Tamil Nadu",
 "country": "India"
 }
 },
 "model": "SM-11",
 "type": "SOFTWARE",
 "manufacturer": "SAMSUNG"
}		
```
RESPONSE CODE: 200 OK

SNo : 2
Name : getAllAssets
METHOD : GET
URL : http://localhost:8090/admin/assets/get/all
RESPONSE :
```json
[
 {
 "assetId": 6,
 "warehouse": {
 "whId": 2,
 "mgrId": 2,
 "address": {
 "location": "Kochi",
 "subLocation": "Ernalkulam",
 "state": "Kerala",
 "country": "India"
 }
 },
 "model": "NO-1",
 "type": "SOFTWARE",
 "manufacturer": "NOKIA"
 },
 
 {
 "assetId": 7,
 "warehouse": {
 "whId": 1,
 "mgrId": 1,asset
 "address": {
 "location": "Chennai",
 "subLocation": "Velacherry",
 "state": "Tamil Nadu",
 "country": "India"
 }
 },
 "model": "SM-2",
 "type": "SOFTWARE",
 "manufacturer": "SAMSUNG"
 }
] 
```
RESPONSE CODE: 200 OK

SNo : 3
Name : createAsset
METHOD : POST
URL : http://localhost:8090/admin/assets
REQUEST BODY :
```json
{
    "assetId": 0,
    "warehouse": {
        "whId": 1,
        "mgrId": 1,
        "address": {
            "location": "Chennai",
            "subLocation": "Velacherry",
            "state": "Tamil Nadu",
            "country": "India"
        }
    },
    "model": "SM-11",
    "type": "SOFTWARE",
    "manufacturer": "SAMSUNG"
}		
```
RESPONSE :
```json
{
    "assetId": 17,
    "warehouse": {
        "whId": 1,
        "mgrId": 1,
        "address": {
            "location": "Chennai",
            "subLocation": "Velacherry",
            "state": "Tamil Nadu",
            "country": "India"
        }
    },
    "model": "SM-11",
    "type": "SOFTWARE",
    "manufacturer": "SAMSUNG"
}		
```
		
RESPONSE CODE: 201 CREATED


SNo : 4 
Name : modifyAsset
METHOD : PUT
URL :
REQUEST BODY :
```json
{
    "assetId": 17,
    "warehouse": {
        "whId": 1,
        "mgrId": 1,
        "address": {
            "location": "Chennai",
            "subLocation": "Velacherry",
            "state": "Tamil Nadu",
            "country": "India"
        }
    },
    "model": "SM-111",
    "type": "SOFTWARE",
    "manufacturer": "SAMSUNG"
}		
```
RESPONSE :
```json
{
    "assetId": 17,
    "warehouse": {
        "whId": 1,
        "mgrId": 1,
        "address": {
            "location": "Chennai",
            "subLocation": "Velacherry",
            "state": "Tamil Nadu",
            "country": "India"
        }
    },
    "model": "SM-111",
    "type": "SOFTWARE",
    "manufacturer": "SAMSUNG"
}		
```
		
RESPONSE CODE: 200 OK


SNo : 5
Name : deleteAssetById
METHOD : DELETE
URL : http://localhost:8090/admin/assets/delete/17
RESPONSE :
```json
Asset Deleted		
```
RESPONSE CODE: 200 OK


### Warehouse

SNo : 1
Name : getWarehouseById
METHOD : GET
URL : http://localhost:8090/admin/warehouses/get/1
RESPONSE :
```json
{
 "whId": 1,
 "mgrId": 1,
 "address": {
 "location": "Chennai",
 "subLocation": "Velacherry",
 "state": "Tamil Nadu",
 "country": "India"
 }
}		
```
RESPONSE CODE: 200 OK


SNo : 2
Name : getAllWarehouses
METHOD : GET
URL : http://localhost:8090/admin/warehouses/get/all
RESPONSE :
```json
[
    {
        "whId": 1,
        "mgrId": 1,
        "address": {
            "location": "Chennai",
            "subLocation": "Velacherry",
            "state": "Tamil Nadu",
            "country": "India"
        }
    },
    {
        "whId": 2,
        "mgrId": 2,
        "address": {
            "location": "Kochi",
            "subLocation": "Ernalkulam",
            "state": "Kerala",
            "country": "India"
        }
    },
]		
```
RESPONSE CODE: 200 OK


SNo : 3
Name : createWarehouse
METHOD : POST
URL : http://localhost:8090/admin/warehouses
REQUEST BODY : POST
```json
{
        "mgrId": 1,
        "address": {
            "location": "Chennai",
            "subLocation": "Velacherry",
            "state": "Tamil Nadu",
            "country": "India"
        }				
```
RESPONSE :
```json
{
        "whId": 1,
        "mgrId": 1,
        "address": {
            "location": "Chennai",
            "subLocation": "Velacherry",
            "state": "Tamil Nadu",
            "country": "India"
        }			
```
		
RESPONSE CODE: 201 CREATED


SNo : 4
Name : modifyWarehouse
METHOD : PUT
URL : http://localhost:8090/admin/warehouses/modify/7
REQUEST BODY :
```json
{
        "mgrId": 7,
        "address": {
            "location": "Chennai",
            "subLocation": "Guindy",
            "state": "Tamil Nadu",
            "country": "India"
        }		
```
RESPONSE :
```json
{
        "mgrId": 7,
        "address": {
            "location": "Chennai",
            "subLocation": "Guindy",
            "state": "Tamil Nadu",
            "country": "India"
        }			
```
		
RESPONSE CODE: 200 OK


SNo : 5 
Name : deleteWarehouseById
METHOD : DELETE
URL : http://localhost:8090/admin/warehouses/delete/8
RESPONSE :
```json
Warehouse Deleted		
```
RESPONSE CODE:


### Shipment
SNo : 1
Name : getShipmentById
METHOD : GET
URL : http://localhost:8090/admin/shipments/get/1
RESPONSE :
```json
{
    "shipmentId": 5,
    "assetId": 1,
    "userId": 1,
    "status": "DELIVERED",
    "sourceWhId": 1,
    "destWhId": 3,
    "shipmentDate": "2021-08-27",
    "deliveryDate": "2021-09-01"
}		
```
RESPONSE CODE: 200 OK


SNo : 2
Name : getAllshipments
METHOD : GET
URL : http://localhost:8090/admin/shipments/get/all
RESPONSE :
```json
[
    {
        "shipmentId": 6,
        "assetId": 2,
        "userId": 2,
        "status": "DELIVERED",
        "sourceWhId": 2,
        "destWhId": 4,
        "shipmentDate": "2021-09-01",
        "deliveryDate": "2021-09-05"
    },
    {
        "shipmentId": 7,
        "assetId": 3,
        "userId": 5,
        "status": "DISPATCHED",
        "sourceWhId": 1,
        "destWhId": 3,
        "shipmentDate": "2021-09-05",
        "deliveryDate": "2021-09-10"
    }
]		
```
RESPONSE CODE: 200 OK


SNo : 3
Name : create Shipment
METHOD : POST
URL : http://localhost:8090/admin/shipments
REQUEST BODY : POST
```json
{
        "assetId": 2,
        "userId": 2,
        "status": "DELIVERED",
        "sourceWhId": 2,
        "destWhId": 4,
        "shipmentDate": "2021-09-01",
        "deliveryDate": "2021-09-05"
    }		
```
RESPONSE :
```json
{
        "shipmentId": 6,
        "assetId": 2,
        "userId": 2,
        "status": "DELIVERED",
        "sourceWhId": 2,
        "destWhId": 4,
        "shipmentDate": "2021-09-01",
        "deliveryDate": "2021-09-05"
    }		
```
		
RESPONSE CODE: 201 CREATED


SNo : 4
Name : modifyWarehouse
METHOD : PUT
URL : http://localhost:8090/admin/shipments/modify/2
REQUEST BODY :
```json
{
        "assetId": 2,
        "userId": 2,
        "status": "DISPATCHED",
        "sourceWhId": 2,
        "destWhId": 4,
        "shipmentDate": "2021-09-01",
        "deliveryDate": "2021-09-05"
    }		
```
RESPONSE :
```json
{
        "assetId": 2,
        "userId": 2,
        "status": "DISPATCHED",
        "sourceWhId": 2,
        "destWhId": 4,
        "shipmentDate": "2021-09-01",
        "deliveryDate": "2021-09-05"
    }			
```
		
RESPONSE CODE: 200 OK


SNo : 5 
Name : deleteWarehouseById
METHOD : DELETE
URL : http://localhost:8090/admin/shipments/delete/4
RESPONSE :
```json
Shipment Deleted		
```
RESPONSE CODE: 200 OK

SNo : 6
Name : change Status of delivery
METHOD : GET
URL : http://localhost:8090/admin/shipments/status/delivered?shipmentId=5
RESPONSE :
```json
Shipment Status set to DELIVERED		
```
RESPONSE CODE: 200 OK



### Report
SNo : 1
Name : get Report by Month
METHOD : GET
URL : http://localhost:8090/admin/shipments/report/month?month=9&year=2021
RESPONSE :
```json
[
 {
 "shipmentId": 6,
 "assetId": 2,
 "userId": 2,
 "status": "DELIVERED",
 "sourceWhId": 2,
 "destWhId": 4,
 "shipmentDate": "2021-09-01",
 "deliveryDate": "2021-09-05"
 },
 {
 "shipmentId": 7,
 "assetId": 3,
 "userId": 5,
 "status": "DISPATCHED",
 "sourceWhId": 1,
 "destWhId": 3,
 "shipmentDate": "2021-09-05",
 "deliveryDate": "2021-09-10"
 }
] 
```
RESPONSE CODE: 200 OK

SNo : 2
Name : get Report by week
METHOD : get Report By week
URL : http://localhost:8090/admin/shipments/report/week?week=3&month=9&year=2021
RESPONSE :
```json
[
    {
        "shipmentId": 7,
        "assetId": 3,
        "userId": 5,
        "status": "DISPATCHED",
        "sourceWhId": 1,
        "destWhId": 3,
        "shipmentDate": "2021-09-05",
        "deliveryDate": "2021-09-10"
    },
    {
        "shipmentId": 8,
        "assetId": 4,
        "userId": 6,
        "status": "DELIVERED",
        "sourceWhId": 2,
        "destWhId": 4,
        "shipmentDate": "2021-09-07",
        "deliveryDate": "2021-09-15"
    }
]		
```
RESPONSE CODE: 200 OK

SNo : 3
Name : get Weekly Report
METHOD : GET
URL : http://localhost:8090/admin/shipments/report/weekly
RESPONSE :
```json
[
    {
        "shipmentId": 6,
        "assetId": 2,
        "userId": 2,
        "status": "DELIVERED",
        "sourceWhId": 2,
        "destWhId": 4,
        "shipmentDate": "2021-09-01",
        "deliveryDate": "2021-09-05"
    },
    {
        "shipmentId": 5,
        "assetId": 1,
        "userId": 1,
        "status": "DELIVERED",
        "sourceWhId": 1,
        "destWhId": 3,
        "shipmentDate": "2021-08-27",
        "deliveryDate": "2021-09-01"
    }
]		
```
RESPONSE CODE: 200 OK


SNo : 4
Name : get monthly Report
METHOD : GET
URL : http://localhost:8090/admin/shipments/report/monthly
RESPONSE :
```json
[
    {
        "shipmentId": 6,
        "assetId": 2,
        "userId": 2,
        "status": "DELIVERED",
        "sourceWhId": 2,
        "destWhId": 4,
        "shipmentDate": "2021-09-01",
        "deliveryDate": "2021-09-05"
    },
    {
        "shipmentId": 5,
        "assetId": 1,
        "userId": 1,
        "status": "DELIVERED",
        "sourceWhId": 1,
        "destWhId": 3,
        "shipmentDate": "2021-08-27",
        "deliveryDate": "2021-09-01"
    }
]		
```
RESPONSE CODE: 200 OK



## Warehouse Manager 

### Asset
*  getAssetsByCode
*  getAllAssets
*  createAsset
*  modifyAsset

### Shipment
*  getShipmentByCode
*  getAllShipments
*  createShipment
*  modifyShipment
*  change Status of delivery
### Report
* get Report by Month
* get Report by week
* get Weekly Report
* get monthly Report

## General User 

### Asset
*  getAssetsByCode
*  getAllAssets

### Shipment
*  getShipmentByCode
*  getAllShipments

### Report
* get Report by Month
* get Report by week
* get Weekly Report
* get monthly Report

