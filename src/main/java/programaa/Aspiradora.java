/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaa;
//importación de todo lo que voy a necesitar para el proyecto

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alber
 */
public class Aspiradora {

    public static void main(String[] args) {
        Random random = new Random();

        //CREACION DE CUENTA
        JOptionPane.showMessageDialog(null, "Bienvenido a la aplicación de su rumba");
        //inicio y declaro estas variable para poder salir y mostrar la posicion y la bateria
        boolean repetir = true;
        double bateriaZona = 0;
        double bateriaZona1 = 0;
        double bateriaZona2 = 0;
        double bateriaZona3 = 0;
        double sobrante = 0;
        String limpiar = null;
        //le digo q se rregistre con JOptionPane
        String regusuario = JOptionPane.showInputDialog(null, "Crea tu nombre de usuario");

        String regcontraseña = JOptionPane.showInputDialog(null, "A continuación introduzca la contraseña");
        String contraseña1;
        String usuario1;
        //utilizo un do while para que hasta q no coincidan los daatos del registro con los de inicio de sesion no de el siguiente paso
        do {
            //INICIO DE SESION
            //le pido que inice sesion
            JOptionPane.showMessageDialog(null, "Inicie sesión");

            usuario1 = JOptionPane.showInputDialog(null, "Nombre de usuario");

            contraseña1 = JOptionPane.showInputDialog(null, "Contraseña");

        } while (!usuario1.equals(regusuario) || !contraseña1.equals(regcontraseña));

        //CONFIGURACIÓN DEL SISTEMA
        JOptionPane.showMessageDialog(null, "Configuración del sistema");

        //numero de habitaciones
        //metros cuadrados
        String m2cocinas = JOptionPane.showInputDialog(null, "¿Cuantas m2 de cocinas hay?");
        double m2cocina = Double.parseDouble(m2cocinas);

        String m2dormitorios = JOptionPane.showInputDialog(null, "¿Cuantos m2 de dormitorios hay?");
        double m2dormitorio = Double.parseDouble(m2dormitorios);

        String m2salones = JOptionPane.showInputDialog(null, "¿Cuantos m2 de salones hay?");
        double m2salon = Double.parseDouble(m2salones);

        String m2baños = JOptionPane.showInputDialog(null, "¿Cuantos m2 baños hay?");
        double m2baño = Double.parseDouble(m2baños);

        //nivel de carga
        String baterias = JOptionPane.showInputDialog(null, "¿Cuanta bateria quieres establecer?");
        double bateria = Double.parseDouble(baterias);

        //DESPLIEGUE DEL MENU DE LA APLICACIÓN
        //utilizo un do while para repetir el menu hasta que el usuario decide salir
        do {
            //opciones a elegir
            String funcionamiento = JOptionPane.showInputDialog(null, "Modos a elegir\n"
                    + "Aspiracion\n"
                    + "Aspiracion y Fregado\n"
                    + "Estado general\n"
                    + "Salir");
            //despliego un switch para que el usuario eliga una de las opciones del menu
            switch (funcionamiento) {
                //primera opcion
                case "Aspiracion":

                    String modo = JOptionPane.showInputDialog(null, "Modos a elegir\n"
                            + "Completo\n"
                            + "Dependencias");
                    //DESPLIEGUE DE TODOS LOS MODOS DE LA OPCION ASPIRACIÓN
                    //despliego un switch para que el usuario eliga una de las opciones del menu

                    switch (modo) {
                        case "Completo":
                            //muestro q comienza a limpiar
                            JOptionPane.showMessageDialog(null, "limpiando habitaciones");
                            //inicio y declaro las variables para obtener las baterias por cada metro
                            double superficie = m2cocina * 1.5;
                            bateriaZona = bateria - superficie;

                            double superficie2 = m2baño * 1.5;
                            bateriaZona1 = bateria - (superficie2 + superficie);

                            double superficie3 = m2salon * 1.5;
                            bateriaZona2 = bateria - (superficie3 + superficie2 + superficie);

                            double superficie4 = m2dormitorio * 1.5;
                            bateriaZona3 = bateria - (superficie4 + superficie3 + superficie2 + superficie);
                            //utilizo un if para que salga el mensaje que corresponda
                            if (bateriaZona <= 3) {
                                JOptionPane.showMessageDialog(null, "Esta parado en cocina, necesito cargar");
                            } else if (bateriaZona1 <= 3) {
                                JOptionPane.showMessageDialog(null, "Esta parado en baño, necesito cargar");
                            } else if (bateriaZona2 <= 3) {
                                JOptionPane.showMessageDialog(null, "Esta parado en salon, necesito cargar");
                            } else if (bateriaZona3 <= 3) {
                                JOptionPane.showMessageDialog(null, "Esta parado en dormitorio, necesito cargar");
                            } else {
                                JOptionPane.showMessageDialog(null, "Se han limpiado todas las habitaciones");

                            }
                            break;

                        case "Dependencias":
                            //pregunto que quiere limpiar
                            limpiar = JOptionPane.showInputDialog(null, "Que habitacion quiere limpiar");

                            switch (limpiar) {
                                case "Cocina":
                                    //inicio y declaro variables para que me diga los metros por bateria
                                    double bateriass = (m2cocina * 100) / 15;
                                    //utilizo un if para q diga lo q corresponde
                                    if (bateriass >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Limpiando habitacion");
                                        sobrante = bateria - bateriass;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante <= 3) {
                                            JOptionPane.showMessageDialog(null, "Necesito cargar");
                                        }

                                    }

                                    break;

                                case "Baño":
                                    //inicio y declaro variables para que me diga los metros por bateria

                                    double baterias2 = (m2baño * 100) / 15;
                                    //utilizo un if para q diga lo q corresponde

                                    if (baterias2 >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Limpiando habitacion");
                                        sobrante = bateria - baterias2;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante <= 3) {
                                            JOptionPane.showMessageDialog(null, "Necesito cargar");
                                        }
                                    }
                                    break;

                                case "Salon":
                                    //inicio y declaro variables para que me diga los metros por bateria

                                    double baterias3 = (m2salon * 100) / 15;
                                    //utilizo un if para q diga lo q corresponde

                                    if (baterias3 >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Limpiando habitacion");
                                        sobrante = bateria - baterias3;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante <= 3) {
                                            JOptionPane.showMessageDialog(null, "Necesito cargar");
                                        }
                                    }
                                    break;

                                case "Dormitorio":
                                    //inicio y declaro variables para que me diga los metros por bateria

                                    double baterias4 = (m2dormitorio * 100) / 15;
                                    //utilizo un if para q diga lo q corresponde

                                    if (baterias4 >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Limpiando habitacion");
                                        sobrante = bateria - baterias4;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante <= 3) {
                                            JOptionPane.showMessageDialog(null, "Necesito cargar");
                                        }
                                    }
                                    break;
                            }
                            JOptionPane.showMessageDialog(null, "Esta parado en: " + limpiar);

                            break;
                    }

                    break;
                //DESPLIEGUE DE TODOS LOS MODOS DE LA OPCION ASPIRACIÓN Y FREGADO

                case "Aspiracion y fregado":
                    String modo1 = JOptionPane.showInputDialog(null, "Modos a elegir\n"
                            + "Completo\n"
                            + "Dependencias");
                    //despliego un switch para que el usuario eliga una de las opciones del menu

                    switch (modo1) {
                        case "Completo":
                            //muestro q comienza a limpiar

                            JOptionPane.showMessageDialog(null, "limpiando habitaciones");
                            //inicio y declaro las variables para obtener las baterias por cada metro

                            double superficie = m2cocina * 2.5;
                            bateriaZona = bateria - superficie;

                            double superficie2 = m2baño * 2.5;
                            bateriaZona1 = bateria - (superficie2 + superficie);

                            double superficie3 = m2salon * 2.5;
                            bateriaZona2 = bateria - (superficie3 + superficie2 + superficie);

                            double superficie4 = m2dormitorio * 2.5;
                            bateriaZona3 = bateria - (superficie4 + superficie3 + superficie2 + superficie);
                            //utilizo un if para que salga el mensaje que corresponda

                            if (bateriaZona <= 3) {
                                JOptionPane.showMessageDialog(null, "Esta parado en cocina, necesito cargar");
                            } else if (bateriaZona1 <= 3) {
                                JOptionPane.showMessageDialog(null, "Esta parado en baño, necesito cargar");
                            } else if (bateriaZona2 <= 3) {
                                JOptionPane.showMessageDialog(null, "Esta parado en salon, necesito cargar");
                            } else if (bateriaZona3 <= 3) {
                                JOptionPane.showMessageDialog(null, "Esta parado en dormitorio, necesito cargar");
                            } else {
                                JOptionPane.showMessageDialog(null, "Se han limpiado todas las habitaciones");

                            }

                            break;

                        case "Dependencias":
                            //pregunto que quiere limpiar
                            limpiar = JOptionPane.showInputDialog(null, "Que habitacion quiere limpiar");

                            switch (limpiar) {
                                case "Cocina":
                                    //inicio y declaro variables para que me diga los metros por bateria

                                    double bateriass = (m2cocina * 100) / 25;
                                    //utilizo un if para q diga lo q corresponde

                                    if (bateriass >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Limpiando habitacion");
                                        sobrante = bateria - bateriass;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante <= 3) {
                                            JOptionPane.showMessageDialog(null, "Necesito cargar");
                                        }
                                    }

                                    break;

                                case "Baño":
                                     //inicio y declaro variables para que me diga los metros por bateria

                                    double baterias2 = (m2baño * 100) / 25;
                                    //utilizo un if para q diga lo q corresponde

                                    if (baterias2 >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Limpiando habitacion");
                                        sobrante = bateria - baterias2;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante <= 3) {
                                            JOptionPane.showMessageDialog(null, "Necesito cargar");
                                        }

                                    }
                                    break;

                                case "Salon":
                                    //inicio y declaro variables para que me diga los metros por bateria

                                    double baterias3 = (m2salon * 100) / 25;
                                    //utilizo un if para q diga lo q corresponde

                                    if (baterias3 >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Limpiando habitacion");
                                        sobrante = bateria - baterias3;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante <= 3) {
                                            JOptionPane.showMessageDialog(null, "Necesito cargar");
                                        }
                                    }
                                    break;

                                case "Dormitorio":
                                    //inicio y declaro variables para que me diga los metros por bateria

                                    double baterias4 = (m2dormitorio * 100) / 25;
                                    //utilizo un if para q diga lo q corresponde

                                    if (baterias4 >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar ");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Limpiando habitacion");
                                        sobrante = bateria - baterias4;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante <= 3) {
                                            JOptionPane.showMessageDialog(null, "Necesito cargar");
                                        }
                                    }
                                    break;
                            }
                            JOptionPane.showMessageDialog(null, "Esta parado en: " + limpiar);

                            break;
                    }

                    break;
                //MUESTRA DE TODA LA INFORMACIÓN Q SE PIDE QUE ESTE EN EL ESTADO GENERAL
                case "Estado general":
                    //utilizo los metodos para poner la fecha y los dias
                    Date date = new Date();
                    DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

                    JOptionPane.showMessageDialog(null, "Son las " + hourFormat.format(date) + " Y estamos a " + dateFormat.format(date));
                    //utilizo un if para q me muestre que bateria tiene
                    if (bateriaZona > 0) {
                        JOptionPane.showMessageDialog(null, "La bateria esta al " + bateriaZona + "%");
                    } else if (bateriaZona1 > 0) {
                        JOptionPane.showMessageDialog(null, "La bateria esta al " + bateriaZona1 + "%");
                    } else if (bateriaZona2 > 0) {
                        JOptionPane.showMessageDialog(null, "La bateria esta al " + bateriaZona2 + "%");
                    } else if (bateriaZona3 > 0) {
                        JOptionPane.showMessageDialog(null, "La bateria esta al " + bateriaZona3 + "%");
                    } else if (sobrante > 0) {
                        JOptionPane.showMessageDialog(null, "La bateria esta al " + sobrante + "%");
                    } else {
                        JOptionPane.showMessageDialog(null, "La bateria esta al " + bateria + "%");

                    }
                    //digo donde esrta parado
                    JOptionPane.showMessageDialog(null, "Esta parado en " + limpiar);

                    double superficie = m2baño + m2cocina + m2salon + m2dormitorio;
                    //digo los metros cuadrados y las habitaciones q tiene 
                    JOptionPane.showMessageDialog(null, "Tiene 5 " + " habitaciones " + " con un total de " + superficie + " m2");

                    break;
                //SE HABILITA LA POSIBILADA AL USUARIO DE SALIR 
                case "Salir":
                    int op = JOptionPane.showConfirmDialog(null,
                            "¿Deseas salir?", "Salida del programa", JOptionPane.YES_NO_OPTION);

                    // System.out.println("Opcion: " + op); // Depuración
                    if (op == JOptionPane.YES_OPTION) {
                        // Quiere salir
                        JOptionPane.showMessageDialog(null, "Ha salido de la aplicación"); // Depuración
                        repetir = false; // Condición de parada del programa 
                        break;
                    }

            }
        } while (repetir);

    }

}
