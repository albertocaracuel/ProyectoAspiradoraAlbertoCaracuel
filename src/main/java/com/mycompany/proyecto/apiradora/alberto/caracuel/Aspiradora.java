/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto.apiradora.alberto.caracuel;

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

        //creacion de cuenta
        JOptionPane.showMessageDialog(null, "Bienvenido a la aplicación de su rumba");

        boolean repetir = true;

        String regusuario = JOptionPane.showInputDialog(null, "Crea tu nombre de usuario");

        String regcontraseña = JOptionPane.showInputDialog(null, "A continuación introduzca la contraseña\n"
                + "Tenga en cuenta que la contraseña solo puede tener letras");
        String contraseña1;
        String usuario1;

        do {
            //inicio de sesion en el sistema 
            JOptionPane.showMessageDialog(null, "Inicie sesión");

            usuario1 = JOptionPane.showInputDialog(null, "Nombre de usuario");

            contraseña1 = JOptionPane.showInputDialog(null, "Contraseña");

            //comienzo del funcionamiento de la aplicación 
        } while (!usuario1.equals(regusuario) || !contraseña1.equals(regcontraseña));

        //configuracion del sistema
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
        //JOptionPane.showMessageDialog(null,"Batería al " +enteroAleatorio + "%");

        do {
            //opciones a elegir
            String funcionamiento = JOptionPane.showInputDialog(null, "Modos a elegir\n"
                    + "Aspiracion\n"
                    + "Aspiracion y fregado\n"
                    + "Estado general\n"
                    + "Salir");

            switch (funcionamiento) {

                case "Aspiracion":

                    String modo = JOptionPane.showInputDialog(null, "Modos a elegir\n"
                            + "Completo\n"
                            + "dependencias");

                    switch (modo) {
                        case "Completo":

                            JOptionPane.showMessageDialog(null, "limpiando habitaciones");

                            double superficie = m2cocina * 2.5;
                            double bateriaZona = bateria - superficie;

                            if (bateriaZona <= 3);
                             {
                                JOptionPane.showMessageDialog(null, "Esta parado en cocina, necesito cargar");
                            }
                            double superficie2 = m2baño * 2.5;
                            double bateriaZona1 = (superficie2 + superficie) - bateria;
                            if (bateriaZona1 <= 3);
                             {
                                JOptionPane.showMessageDialog(null, "Esta parado en baño, necesito cargar");
                            }
                            double superficie3 = m2salon * 2.5;
                            double bateriaZona2 = (superficie3 + superficie2 + superficie) - bateria;
                            if (bateriaZona2 <= 3);
                             {
                                JOptionPane.showMessageDialog(null, "Esta parado en salon, necesito cargar");
                            }
                            double superficie4 = m2dormitorio * 2.5;
                            double bateriaZona3 = (superficie4 + superficie3 + superficie2 + superficie) - bateria;
                            if (bateriaZona3 <= 3);
                             {
                                JOptionPane.showMessageDialog(null, "Esta parado en dormitorio, necesito cargar");
                            }
                            break;

                        case "dependencias":

                            String limpiar = JOptionPane.showInputDialog(null, "Que habitacion quiere limpiar");

                            switch (limpiar) {
                                case "cocina":

                                    double bateriass = (m2cocina * 100) / 15;

                                    if (bateriass >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "limpiando habitacion");
                                        double sobrante = bateria - bateriass;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante <= 3);
                                        {
                                            JOptionPane.showMessageDialog(null, "necesito cargar");
                                        }

                                    }

                                    break;

                                case "baño":
                                    double baterias2 = (m2baño * 100) / 15;

                                    if (baterias2 >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "limpiando habitacion");
                                        double sobrante = bateria - baterias2;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante <= 3);
                                        {
                                            JOptionPane.showMessageDialog(null, "necesito cargar");
                                        }
                                    }
                                    break;

                                case "salon":
                                    double baterias3 = (m2salon * 100) / 15;

                                    if (baterias3 >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "limpiando habitacion");
                                        double sobrante = bateria - baterias3;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante <= 3);
                                        {
                                            JOptionPane.showMessageDialog(null, "necesito cargar");
                                        }
                                    }
                                    break;

                                case "dormitorio":
                                    double baterias4 = (m2dormitorio * 100) / 15;

                                    if (baterias4 >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "limpiando habitacion");
                                        double sobrante = bateria - baterias4;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante <= 3);
                                        {
                                            JOptionPane.showMessageDialog(null, "necesito cargar");
                                        }
                                    }
                                    break;
                            }
                            JOptionPane.showMessageDialog(null, "Esta parado en: " + limpiar);

                            break;
                    }

                    break;

                case "Aspiracion y fregado":
                    String modo1 = JOptionPane.showInputDialog(null, "Modos a elegir\n"
                            + "Completo\n"
                            + "dependencias");

                    switch (modo1) {
                        case "Completo":

                            JOptionPane.showMessageDialog(null, "limpiando habitaciones");

                            double superficie = m2cocina * 2.5;
                            double bateriaZona = bateria - superficie;

                            if (bateriaZona <= 3);
                             
                                JOptionPane.showMessageDialog(null, "Esta parado en cocina, necesito cargar");
                            
                            double superficie2 = m2baño * 2.5;
                            double bateriaZona1 = (superficie2 + superficie) - bateria;
                            if (bateriaZona1 <= 3);
                             
                            JOptionPane.showMessageDialog(null, "Esta parado en baño, necesito cargar");
                            
                            double superficie3 = m2salon * 2.5;
                            double bateriaZona2 = (superficie3 + superficie2 + superficie) - bateria;
                            if (bateriaZona2 <= 3);
                             
                                JOptionPane.showMessageDialog(null, "Esta parado en salon, necesito cargar");
                            
                            double superficie4 = m2dormitorio * 2.5;
                            double bateriaZona3 = (superficie4 + superficie3 + superficie2 + superficie) - bateria;
                            if (bateriaZona3 <= 3);
                             
                                JOptionPane.showMessageDialog(null, "Esta parado en dormitorio, necesito cargar");
                            

                            break;

                        case "dependencias":

                            String limpiar = JOptionPane.showInputDialog(null, "Que habitacion quiere limpiar");

                            switch (limpiar) {
                                case "cocina":

                                    double bateriass = (m2cocina * 100) / 25;

                                    if (bateriass >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "limpiando habitacion");
                                        double sobrante = bateria - bateriass;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante <= 3);
                                        {
                                            JOptionPane.showMessageDialog(null, "necesito cargar");
                                        }
                                    }

                                    break;

                                case "baño":
                                    double baterias2 = (m2baño * 100) / 25;

                                    if (baterias2 >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "limpiando habitacion");
                                        double sobrante = bateria - baterias2;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante >= 3);
                                        {
                                            JOptionPane.showMessageDialog(null, "necesito cargar");
                                        }

                                    }
                                    break;

                                case "salon":
                                    double baterias3 = (m2salon * 100) / 25;

                                    if (baterias3 >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "limpiando habitacion");
                                        double sobrante = bateria - baterias3;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante <= 3);
                                        {
                                            JOptionPane.showMessageDialog(null, "necesito cargar");
                                        }
                                    }
                                    break;

                                case "dormitorio":
                                    double baterias4 = (m2dormitorio * 100) / 25;

                                    if (baterias4 >= bateria) {
                                        JOptionPane.showMessageDialog(null, "Necesita cargar ");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "limpiando habitacion");
                                        double sobrante = bateria - baterias4;
                                        JOptionPane.showMessageDialog(null, "Me ha sobrado " + sobrante + "% de bateria");
                                        if (sobrante <= 3);
                                        {
                                            JOptionPane.showMessageDialog(null, "necesito cargar");
                                        }
                                    }
                                    break;
                            }
                            JOptionPane.showMessageDialog(null, "Esta parado en: " + limpiar);

                            break;
                    }

                    break;

                case "Estado general":

                    Date date = new Date();
                    DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

                    JOptionPane.showMessageDialog(null, "Son las " + hourFormat.format(date) + " Y estamos a " + dateFormat.format(date));

                    JOptionPane.showMessageDialog(null, "La bateria está al " + bateria + "%");

                    JOptionPane.showMessageDialog(null, "Esta parado en ");

                    double superficie = m2baño + m2cocina + m2salon + m2dormitorio;

                    JOptionPane.showMessageDialog(null, "Tiene 5 " + " habitaciones " + " con un total de " + superficie + " m2");

                    break;

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
