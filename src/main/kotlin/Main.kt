fun main() {
    var me=Car("vol","mercedex","blue"50)
    me.carry(10)
    me.identity()
    println(me.calculateParkingFee(30))
    var x= Bus("Isuzu","Isuzu70""Yellow",5)
    println(x.maxTripFare(100.00))
    println(x.calculateParkingFee(5))



}

open class Car(var make:String,var model:String,var Colour:String,var capacity:Int){
    fun carry(people:Int){
        if(people<=capacity):{
            println("carry $people passangers")
        }else{
            var x=people-capacity
            println("over capacity by $x people")
        }

    }
    fun identity(){
        println("i am a $Colour $make $model")
    }
    open fun calculateParkingFee(hours:Int):Int{
        var fees=hours*20
        return fees
    }

}
class Bus(make:String,model:String,colour:String,capacity:Int):Car(make,model,colour,capacity){
    fun maxTripFare(fare:Double):Double{
        var max=capacity*fare
        return max
    }

    override fun calculateParkingFee(hours: Int): Int {
        return super.calculateParkingFee(hours)
        var cap=hours*capacity
        return cap
    }


}