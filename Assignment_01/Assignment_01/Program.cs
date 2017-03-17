using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;

namespace Assignment_01
{

    class Program
    {
        static void Main(string[] args)
        {
            

            Person persnl = new Person();
            Account acc = new Account();
            DateTime value = new DateTime();
            int MenChoice;
            start:
            Console.WriteLine("******Wellcome to Quick Cash bank ATM Service******");
            Console.WriteLine("                   Account Menu " + Environment.NewLine +
                " 1: Create New Account" + Environment.NewLine +
                " 2: Credit Account" + Environment.NewLine +
                " 3: Withdraw" + Environment.NewLine +
                " 4: Display Account" + Environment.NewLine +
                " 5: Exit ");
                Console.Write("Enter your choice: ");
                try
                {
                    MenChoice = int.Parse(Console.ReadLine());
                }
                catch
                {
                    Console.WriteLine("ERROR: You have entered an invalid numerical value, read MENU and try again");
                    goto start;
                }

                switch (MenChoice)
                {
                        
                    case 1: Console.WriteLine(" You have chosen to open a new account please provide the information required.");
                   

                        persnl.Read();
                        
              
                    
                    Console.Clear();
                        goto start;

                    case 2: acc.Deposit_();
                    
                    goto start;
                    case 3: acc.Witdraw_();
                        goto start;
                    case 4: persnl.Disply_();
                            acc.Disply1_();
                        goto start;
                    case 5: Console.WriteLine("Thank you for using Quick Cash bank ATM Service");
                        break;
                    default: Console.WriteLine("Enter numbers between 1-5."); goto start;
                        


                }

        }
    }
}
