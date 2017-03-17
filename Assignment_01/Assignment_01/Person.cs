using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace Assignment_01
{
    class Person
    {
        public string LastName, FirstName, Gender, DaOfBrh, ResAddress;
        public string Read()
        {
            StreamWriter sw = new StreamWriter("C:/Users/JT/Documents/Test.txt", true, Encoding.ASCII);
            //Used to capture data
            Console.Write("Enter your Last Name: ");
            LastName = Console.ReadLine();
            sw.WriteLine(LastName);
            Console.Write("Enter your First Name: ");
            FirstName = Console.ReadLine();
            sw.WriteLine(FirstName);
            Console.Write("Enter gender 'male' or 'female': ");
            Gender = Console.ReadLine();
            sw.WriteLine(Gender);
            Console.Write("Enter Date of Birth 'yyyy/mm/dd'");
            DaOfBrh = Console.ReadLine();
            sw.WriteLine(DaOfBrh);
            Console.Write("Enter Ressidential Address: ");
            ResAddress = Console.ReadLine();
            sw.WriteLine(ResAddress);
            sw.Close();
            return "";
        }
        public void Disply_()
        {
            String line;
            StreamReader sr = new StreamReader("C:/Users/JT/Documents/Test.txt");
            //Read the first line of text
            line = sr.ReadLine();

            //Continue to read until you reach end of file
            while (line != null)
            {
                //write the lie to console window
                Console.WriteLine(line);
                //Read the next line
                line = sr.ReadLine();
            }

            //close the file
            sr.Close();
            Console.ReadLine();
            /*//Display Function
            Console.WriteLine("Last name {0}", LastName);
            Console.WriteLine("First name {0}", FirstName);
            Console.WriteLine("Gender {0}", Gender);
            Console.WriteLine("Date Of Birth {0}", DaOfBrh);
            Console.WriteLine("Residential Address {0}", ResAddress);*/
        }
    }
}
