package com.example.medfinder

class drug {
    var Uid:String?=null
    var name:String?=null
    var dosage:String?=null
    var qty:String?=null
    var price:String?=null

    constructor(){

    }
    constructor(Uid: String?,name:String?,dosage:String?,qty:String?,price:String){
        this.Uid=Uid
       this.name=name
        this.dosage=dosage
        this.qty=qty
        this.price=price

    }
}