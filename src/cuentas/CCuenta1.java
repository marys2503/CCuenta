package cuentas;

public class CCuenta1 {
public double dSaldo; // Atributo de la clase Cuenta
	
    public static void main(String[] args)
    {
    	CCuenta1 cuenta1 = new CCuenta1();
    	System.out.println("Saldo Incial: " + cuenta1.dSaldo + " euros");
    	cuenta1.ingresar(-100);
    	System.out.println("Saldo Incial: " + cuenta1.dSaldo + " euros");
    	cuenta1.ingresar(100);
    	System.out.println("Saldo tras ingreso: " + cuenta1.dSaldo + " euros");
    	cuenta1.ingresar(200);
    	System.out.println("Saldo tras ingreso: " + cuenta1.dSaldo + " euros");
    	cuenta1.ingresar(300);
    	System.out.println("Saldo tras ingreso: " + cuenta1.dSaldo + " euros");
    	cuenta1.retirar(50);
    	System.out.println("Saldo tras retirada: " + cuenta1.dSaldo + " euros");
    }
 
    
    public int ingresar(double cantidad) 
    {
    	int iCodErr;
    	
        if (cantidad < 0)
        {
        	System.out.println("No se puede ingresar una cantidad negativa");
        	iCodErr = 1;
        }
        else if (cantidad == -3)
        {
            System.out.println("Error detectable en pruebas de caja blanca");
        	iCodErr = 2;
        }
        else
        {
        	dSaldo = dSaldo + cantidad;
        	iCodErr = 0;
        }
             
        return iCodErr;
    }

    /**
     * Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    public void retirar (double cantidad) 
    {
        if (cantidad <= 0)
        {
            System.out.println("No se puede retirar una cantidad negativa");
        }
        else if (dSaldo < cantidad)
        {
            System.out.println("No se hay suficiente saldo");
        }
        else
        {
        	dSaldo = dSaldo - cantidad;
        }
    }
	
	
}
