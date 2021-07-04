
import java.util.Scanner;

//Mi clase en Java
//public hace referencia a clase de manera pública
public class HolaMundo {
    public static void main(String[] args) { //Método el cual ejecuta el programa
        System.out.println("Hola Mundo desde Java"); // Imprime en consola
        //variables tipo nombre y a que será igual inicia con minuscula y si hay otra palabra es con mayúscula CamelCase
        //Se definel a variable
        int miVariableEntera = 10; 
        System.out.println(miVariableEntera);
        //Se modifica la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        //Se define la variable
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena); //Ctrl+Space
        //Se modifica la variable
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        //var - Inferencia de tipos en Java
        //int miVariableEntera2 = 10;
        //ahora
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println(miVariableCadena2 + miVariableCadena); //soutv + tab
        
        //valores permitidos para las variables
        var nombre = "Gustavo";
        var edad = 25;
        
        //concatenacion con el signo + en variables de tipo String
        System.out.println("Mi nombre es: " + nombre + " mi Edad es: " + edad);
        
        //Otro ejemplo
        var a = 1;
        var b = 2;
        
        System.out.println(a + b); // aca lo suma
        System.out.println(a + b + nombre); // aca lo suma y lo concatena con el nombre
        System.out.println(nombre + a + b); // aca el nombre lo concatena con cada numero
        System.out.println(nombre + (a + b)); // aca el nombre lo concatena con la suma
        //Si primero encuentra una cadena, todo lo demas lo va a concatenar
        //Si primero encuentra numeros, realiza primero la operacion y luego la concatenacion
        // caracter especial \n nueva linea
        // caracter especial \t tabulador
        // caracter especial \b retroceso
        // diagonoal inversa para caracters espsciales \' \"
        
        //Scanner
        /*
        System.out.println("Escribe el titulo del libro");
        Scanner sc = new Scanner (System.in);
        var tituloLibro = sc.nextLine();
        
        System.out.println("Escribe el autor de libro");
        Scanner sc1 = new Scanner (System.in);
        var autorLibro = sc1.nextLine();
        
        System.out.println("El titulo del libro es: " + tituloLibro + " fue escrito por: " + autorLibro);
        */

        //parseo
        byte numeroByte = (byte)5;
        System.out.println("El valor del byte es: " + numeroByte);
        
        int letra = 'A';
        System.out.println("La letra es: " + letra);
        
        String letra1 = "1";
        var num = Integer.parseInt(letra1);
        System.out.println("La letra es: " + num);
        
        /*Ejercicio Omar
                
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Escriba el nombre del libro: ");
        var nom = sc2.nextLine();
        
        System.out.println("Escriba el id del libro: ");
        var id = sc2.nextLine();
        
        System.out.println("Escriba el precio del libro: ");
        var precio = sc2.nextInt();
        
        System.out.println("El nombre del libro es: " + nom);
        System.out.println("El id del libro es: " + id);
        System.out.println("El precio del libro es: " + precio);
        
        if(precio>50){
            var envioGratuito = true;
            System.out.println("Su envio sera gratis: " + envioGratuito);
        }else{
            var envioGratuito = false;
            System.out.println("Su envio no sera gratis: " + envioGratuito);
        }
        */
        
        //EJERCICIO
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nom = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
 
        System.out.println(nom + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
        */
        
        //OPERADORES UNARIOS
        var e = 3;
        var f = ++e;//primero se incrementa la variable y despues se usa su valor
        
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        var g = 5;
        var h = g++;//primero se utiliza su valor y despues se incrementa la variable
        
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //OPERADORES TERNARIOS
        var resultado = (3 > 8) ? "verdadero" : "falso" ; //? parte verdadera y : parte falsa
        System.out.println("El resultado es: = " + resultado);
        
        var n = 9;
        resultado = (n % 2 == 0) ? "par" : "impar";
        System.out.println("El resultado es = " + resultado);
    }
}
