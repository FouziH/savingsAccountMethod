## Methods 
    --Create object behavior using methods 


    Methods                               Fields

    (behavior)                            (state)
    ------------                        ------------
    withdrawal, deposit                    balance


    State tells us what a savings account should know:
        The balance of money available
    

    The behavior tells us what tasks a savings account should be able to perform:
        Depositing - increasing the amount available 
        Withdrawing - decreasing the amount available 
        Checking the balance - displaying the amount available 
        Transaction -- displaying detailed transaction 
    
    Methods are repeatable, modular blocks of code used to accomplish specific tasks

    Scope 
        A method is task that an object of a class performs 
        We mark of the domain of this task using a curly braces { , and }

        Everything inside the {} <---- is part of the task. 
            ** This domain inside teh {} is called scope 

        
        Adding Parameters


        Returns


        Remember, variables can only exist in the scope that they were declared in. We can use a value outside of the method it was created in if we return it from the method. 

        We return a value by using the keyword return:

        public int numberOfTire () {
            int tires = 4;

                return tires;
        }


        Void keywords mean completely empty and indicates that no value is returned after calling that method.

        The toString() Method

            
    



