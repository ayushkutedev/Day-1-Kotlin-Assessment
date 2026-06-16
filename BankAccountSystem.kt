open class BankAccount(val accountHolder: String) {
    private var balance = 0.0

    fun deposit(amount: Double) {
        if (amount <= 0) {
            println("Invalid amount!")
        } else {
            balance = balance + amount
            println("₹$amount deposited successfully!")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > balance) {
            println("Insufficient funds!")
        } else {
            balance = balance - amount
            println("₹$amount withdrawn successfully!")
        }
    }

    fun checkBalance() {
        println("Balance: ₹$balance")
    }
}

class SavingsAccount(accountHolder: String) : BankAccount(accountHolder) {
    fun showAccountType() {
        println("Account Type: Savings Account")
    }
}

fun main() {
    println("=== Welcome to Kotlin Bank ===")
    print("Enter your name: ")
    val name = readLine()!!

    val account = SavingsAccount(name)
    account.showAccountType()

    var choice = 0

    while (choice != 5) {
        println("\n1. Deposit")
        println("2. Withdraw")
        println("3. Check Balance")
        println("4. Account Holder Name")
        println("5. Exit")
        print("Enter choice: ")

        choice = readLine()!!.toInt()

        if (choice == 1) {
            print("Enter deposit amount: ₹")
            val amount = readLine()!!.toDouble()
            account.deposit(amount)

        } else if (choice == 2) {
            print("Enter withdraw amount: ₹")
            val amount = readLine()!!.toDouble()
            account.withdraw(amount)

        } else if (choice == 3) {
            account.checkBalance()

        } else if (choice == 4) {
            println("Account Holder: ${account.accountHolder}")

        } else if (choice == 5) {
            println("Thank you for using Kotlin Bank!")

        } else {
            println("Invalid choice!")
        }
    }
}