/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Constantes
        final String NOM_AMO = "Sócrates";
        final String AMO_OK = "¡Ave César!";
        final String AMO_NO = "¡Sócrates socorro!";

        //Variable
        String nomPer;

        try {
            //Cabecera
            System.out.println("Alternativa Loro");
            System.out.println("================");

            //Pregunta
            System.out.print("Persona que se acerca ..: ");
            nomPer = SCN.nextLine();

            //Separador
            System.out.println("---");

            //Dueño loro
            System.out.printf("Dueño del loro .........: %s%n", NOM_AMO);

            //Separador
            System.out.println("---");

            //Mensaje de alerta
            if (nomPer.equals(NOM_AMO)) {
                System.out.printf("Mensaje Loro ...........: %s%n", AMO_OK);
            } else {
                System.out.printf("Mensaje Loro ...........: %s%n", AMO_NO);
            }

        } catch (Exception e) {

        }

    }
}
