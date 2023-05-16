fun main() {

    println("Bem vindo ao Bytebank")

    val conta = Conta("Alex",100)
    val conta2 = Conta("Ana", 101)
    println(conta.titular)

    println("Deposito")
    conta.deposita(70.0)
    println(conta.getsaldo())

    println("Deposito")
    conta2.deposita(250.0)
    println(conta2.getsaldo())

    println("Saque")
    conta.saca(50.0)
    println(conta.getsaldo())

    println("Transferencia ana para alex")
    if (conta2.transfere(200.0 ,conta)){
        println("transferido")
    }
    else {
        println("não transferido")
    }
    println(conta2.getsaldo())
    println(conta.getsaldo())
}

class Conta(
    val titular: String,
    val numero: Int
){
    var saldo = 0.0
        private set

//    constructor(){
//        this.titular = titular
//        this.numero = numero
//
//    }

    fun deposita(valor: Double){
        if(valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double){
        if(saldo>=valor){
            saldo-=valor
        }
    }

    fun transfere(valor: Double,destino:Conta):Boolean{
        if(saldo >= valor){
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
    fun getsaldo():Double{
        return saldo
    }
}


fun testaCopiaEReferencias(){

}
fun testaLacos(){
        for (i in 1..5) {
            //for (i in 5 downTo 1) , for (i in 5 downTo 1 step 2)

            if( i == 4){
                //pula o 4
                continue
            }

            //var-mutavel val-imutavel
            val titular = "Alex $i"
            val numeroConta = 1000 +i
            var saldo = i + 10.0

            println("Titular $titular")
            println("Titular $numeroConta")
            println("Titular $saldo")
            println()
        }
        //testaCondicoes(saldo)
    }
fun testaCondicoes(saldo: Double) {

        when {
            saldo > 0.0 -> println("conta é positiva")
            saldo == 0.0 -> println("conta é neutra")
            else -> println("conta negativa")
        }
    }
