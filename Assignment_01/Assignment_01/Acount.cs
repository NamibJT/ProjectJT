using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Assignment_01
{
    //Beggining of Account Class : Inherits Person Class
    class Account : Person
    {
        public string Acctype;
        public double BalAmnt, StrAmnt = 0, OdLiAmnt = 1000, Dep, WitDraw;
        public int AccNr;
        public DateTime OT;

        public void Read1()
        {
            Console.WriteLine("Account information");
            Console.Write("Enter Account Number provided: ");
            try
            {
                AccNr = int.Parse(Console.ReadLine());
            }
            catch
            {
                Console.WriteLine("Please enter numeric account number provided.");
            }


            Console.Write("Enter Account type 'Savings' or 'Cheque': ");
            Acctype = Console.ReadLine().ToUpper();
            if (Acctype == "CHEQUE")
            {
                Console.WriteLine("Account type is {0}", Acctype);
            }
            else if (Acctype == "SAVINGS")
            {
                Console.WriteLine("Account type is {0}", Acctype);
            }
            else
            {
                Console.Write("The account type provided could not be recognised.");
            }


            /*Console.Write("Your starting balance is: ");
            //BalAmnt = int.Parse(Console.ReadLine());
            //Console.Write("Overdraft Limit: ");
            //OdLiAmnt = int.Parse(Console.ReadLine());*/
            Console.WriteLine(DateTime.Today);
            /*OT = Convert.ToDateTime(Console.ReadLine());*/
            return;
        }
        //Display Method
        public void Disply1_()
        {
            Console.WriteLine("Account Number {0}", AccNr);
            Console.WriteLine("Account Type {0}", Acctype);
            Console.WriteLine("Account Balance {0}", BalAmnt);
            Console.WriteLine("Overdaraft Limit {0}", OdLiAmnt);
            Console.WriteLine("Date Account Opened {0}", DateTime.Today);
        }
        //Deposit Method
        public void Deposit_()
        {
            Console.WriteLine("Enter the amount you wish to deposit");

            try
            {
                Dep = double.Parse(Console.ReadLine());
            }
            catch
            {
               Console.WriteLine("Please enter numeric value");
            }
            
            if (Dep <= 0)
            {
                Console.WriteLine("Please deposit an amount larger than zero");
            }
            else
            {
                //Formula to update the Acount balance
                BalAmnt = balAmnt(BalAmnt, Dep);
                Console.WriteLine("Your new balance is N$ {0}", BalAmnt);
            }
        }
        public double balAmnt(double b, double d)
        {
            double NewD = (b + d);
            return NewD;
        }
        //Method used to Withdraw
        public void Witdraw_()
        {
            Console.WriteLine("Enter the amount you wish to withdraw");
            try
            {
                WitDraw = double.Parse(Console.ReadLine());
            }
            catch
            {
                Console.WriteLine("Please Enter numeric value");
            }
            if (WitDraw % 1 != 0)
            {
                Console.WriteLine("Please enter amount in multiples of 1");
            }
            else if (WitDraw > (BalAmnt + 1000))
            {
                Console.WriteLine("Insuficient funds please deposit and try again");
            }
            else if (WitDraw <= 0)
            {
                Console.WriteLine("Please Enter a positive balance multiple of 10");
            }
            else
            {
                BalAmnt = baAmnt(BalAmnt, WitDraw);
                Console.WriteLine("COLLECT CASH");
                Console.WriteLine("YOUR CURRENT BALANCE IS {0}", BalAmnt);
            }
        }
        public double baAmnt(double b, double w)
        {
            double NewW = (b - w);
            return NewW;
        }


    }
}
