WiSell-models
======

Models entities part  
  
**Main models in mongodb**
  
Client :{  
    _id:ObjectId(),  
    phone:String,  
    imei:String,  
    name :String,  
    email :String,  
    _created:Date  
}    

Hotspot:{  
   _id:ObjectId(),  
   phone:String,  
   imei:String,  
   name:String,  
   address:String,  
   password:String,  
   loc:Array,  
   tel:String  
}    

Transaction:{  
   _id:ObjectId(),  
   client: ObjectIdClient,  
   hotspot: ObjectIdHotspot,  
   amount:Number,  
   created: Date,  
   dateClient : Date  
}  
//Normalization makes writes faster
  
Connection:{  
  _id:ObjectId(),  
  phone:ObjectIdClient,  
  hotspot:ObjectIdHotspot,  
  status:Boolean,  
  created:Date,  
  dateClient:Date  
}  

