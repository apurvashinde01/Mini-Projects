Project: Banking Application

Problem Statement:

There is bank near your home. The bank manager knows that you are very good in Java programming. He approaches you to create an application for his bank. During your first demo you have to create a simple scenario that gets the account number, account holder name and current balance of that account. You should ask whether the user wants to deposit money or to withdraw money or to display the account details.
The program should have two classes- Main.java and Account.java.
i. Create a class called Main. Declare four variables. accNum of type int, holderName of String, type of String and bal of int.
accNum – Account Number
holderName – Account holder name
type – Account type ( Savings or Current)
ii. Pass these variables as parameters to the constructor in Account class.
bal – Current balance in account
iii. Create a class called Account
iv. Create a constructor in Account that accepts four variables as arguments.
v. Create a method called credit() of void type which accepts the amount to be credited from account as integer.
vi. Create a method called debit() of void type which accepts the amount to be debited from account as integer. If the balance is less than the amount to be debited it should display “Insufficient balance”.
vii. Create a method called display() of void type which has no arguments and it should display the account details.
viii. In Main class using switch case call these methods.
1. Credit Account
2. Debit Account
3. Display Account Details
ix. If you want to credit or debit the amount get the amount from user in switch case.
Sample Input and Output 1:
Enter the account number
23657
Enter the account holder name
Divs
Enter the type of account
Savings
Enter the balance
5600
1. Credit Account
2. Debit Account
3. Display Account Details
Enter your choice
1
Enter the amount to be credited
6000
1. Credit Account
2. Debit Account
3. Display Account Details
Enter your choice
3
Account Details
Accont Number : 23657
Accont Name : Divs
Accout type :Savings
Accout Balance :11600

1. Credit Account
2. Debit Account
3. Display Account Details
Enter your choice
2
Enter the amount to be debited
8000
1. Credit Account
2. Debit Account
3. Display Account Details
Enter your choice
3
Account Details
Accont Number : 23657
Accont Name : Divs
Accout type :Savings
Accout Balance :3600

1. Credit Account
2. Debit Account
3. Display Account Details
Enter your choice
2
Enter the amount to be debited
4000
Insufficient Balance
1. Credit Account
2. Debit Account
3. Display Account Details
Enter your choice
4