fun main(args: Array<String>){
    Mobile()
    var mobile=Mobile()
    println("         Welcome! \n" +
            "Which Brand Do You Want to Buy?\n"
            + "- Apple \n- Samsung \n- Exit")
    var Brand=readLine()
    var Model: String? =null
    var MRP: Double =0.0
    when (Brand){
        "Apple"->{ println(
            "Which Model Do You Want to Buy?\n"
                    + "- IPhone 13 Pro \n- IPhone 13 mini")
         Model=readLine()
        }

        "Samsung"-> { println(
            "Which Model Do You Want to Buy?\n"
                    + "- Galaxy S 20  \n- Galaxy A 10 ")
         Model=readLine()
        }
        else->System.exit(0)
    } // end of when brand

    when(Model){
        "IPhone 13 Pro"->{  MRP=4000.0}
        "IPhone 13 mini"->{  MRP=3500.0}
        "Galaxy S 20"->{ MRP=3000.0}
        "Galaxy A 10"->{ MRP=2000.0}


    } // end of when model

    mobile.insert(Brand,Model,MRP)
    mobile.printDetails()
}

class Mobile {
    var Brand: String?=null
    var Model: String?=null
    var MRP: Double=0.0
    var Discount:Double=0.05

    fun insert( Brand: String?,
                Model: String?,
                MRP: Double){
        this.Brand=Brand
        this.Model=Model
        this.MRP=MRP
    }
    fun getActualPrice(): Double {

        var Price=MRP*Discount
        Price=MRP-Price
        return Price
    }
    fun printDetails(){
        println("Your Purchase Details:\n" +
                "Model:"+Model +
                "\nBrand:"+Brand+
                "\nPrice:"+MRP+
                "\nPrice After Discount(5%):" + getActualPrice()
        )
    }
}
