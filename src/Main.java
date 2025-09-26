import java.lang.Math;
public class Main {


    public static void main(String[] args) {


        // ============================================================

        // RETO FINAL – Mini sistema de logros (multijuego)

        // ============================================================

        // OBJETIVO:

        // Implementa un sistema que, a partir de estadísticas de una partida,

        // calcule y muestre los LOGROS desbloqueados por el jugador.

        //

        // ------------------------------------------------------------

        // 1) DECLARA ESTAS VARIABLES DE ENTRADA (asigna valores fijos para probar):

        //    - String juego: "Fortnite", "LoL", "Minecraft", "Pokemon"

        //    - int kills

        //    - int muertes

        //    - int asistencias

        //    - int tiempoMin: minutos jugados

        //    - int objetivos: (torres destruidas, bosses, capturas, construcciones…)

        //    - boolean desconexion: true si el jugador se desconectó en mitad

        //    - int dañoHecho

        //    - int dañoRecibido

        //    - int oro: moneda conseguida

        //

        // ------------------------------------------------------------

        // 2) NORMAS GENERALES (usa if / else if / else y condiciones compuestas):

        //    - Si desconexion es true y tiempoMin < 5 → imprimir:

        //         "Logro NEGATIVO: Rage Quit 😠"

        //      IMPORTANTE: si ocurre esto, NO concedas otros logros de "PRO"

        //      en la misma partida (prioridad negativa).

        //

        //    - Calcula KDA = (kills + asistencias) / max(1, muertes)

        //      (evita división por 0 usando Math.max).

        //

        //    - Clasificación por KDA (elige SOLO UNA, la primera que cumpla):

        //        KDA ≥ 5          → "Jugador PRO"

        //        3 ≤ KDA < 5      → "Jugador BUENO"

        //        1 ≤ KDA < 3      → "Jugador NORMAL"

        //        KDA < 1          → "Jugador NOOB"

        //

        //    - Logros básicos independientes (pueden acumularse):

        //        kills >= 10                    → "Logro: Cazador experto 🏹"

        //        muertes == 0 && kills >= 5     → "Logro: Intocable 👑"

        //        tiempoMin > 60                 → "Logro: Maratón gamer ⏱"

        //        dañoHecho > dañoRecibido*2     → "Logro: Dominio total 💥"

        //        objetivos >= 3                 → "Logro: Objetivos de mapa 🎯"

        //

        // ------------------------------------------------------------

        // 3) REGLAS ESPECÍFICAS POR JUEGO (selecciona por valor de 'juego'):

        //    - Fortnite:

        //        si kills >= 15 && muertes <= 2 → "Victoria agresiva (Fortnite) 🔫"

        //        si oro >= 2000                 → "Ahorrista de V-Bucks (Fortnite) 💰"

        //

        //    - LoL:

        //        si objetivos >= 2 && asistencias >= 10 → "Shotcaller (LoL) 🗣"

        //        si dañoHecho >= 30000 && muertes <= 3  → "Carry principal (LoL) 🛡"

        //

        //    - Minecraft:

        //        si tiempoMin >= 45 && dañoRecibido == 0 → "Superviviente pacífico (MC) 🌿"

        //        si objetivos >= 5                        → "Constructor incansable (MC) 🧱"

        //

        //    - Pokemon:

        //        si kills >= 6 && dañoRecibido <= 1000 → "Entrenador maestro (PKMN) 🧢"

        //        si asistencias >= 3                   → "Apoyo del equipo (PKMN) 🤝"

        //

        // ------------------------------------------------------------

        // 4) PRIORIDADES Y EXCLUSIONES (orden y anidación de if):

        //    - Si se activa "Rage Quit 😠", NO mostrar "Jugador PRO".

        //    - Si muertes == 0 && kills == 0 && asistencias == 0 && tiempoMin < 2:

        //        imprimir "Partida inválida: AFK" y NO mostrar más logros.

        //

        // ------------------------------------------------------------

        // 5) SALIDA (impresiones sugeridas):

        //    - Resumen de entrada (todas las estadísticas)

        //    - KDA calculado

        //    - Rango por KDA (solo uno)

        //    - Lista de logros desbloqueados (varios posibles)

        //    - Mensajes de exclusión si corresponde (p. ej., Rage Quit / AFK)

        //

        // ------------------------------------------------------------

        // 6) PRUEBAS RÁPIDAS (cambia las variables y ejecuta varias veces):

        //    CASO A: LoL, kills=12, muertes=2, asist=15, tiempo=38, obj=3, desc=false, dañoH=32000, dañoR=9000, oro=1500

        //    CASO B: Fortnite, kills=16, muertes=2, asist=3, tiempo=25, obj=1, desc=false, dañoH=18000, dañoR=6000, oro=2300

        //    CASO C: Minecraft, kills=0, muertes=0, asist=0, tiempo=1, obj=0, desc=false, dañoH=0, dañoR=0, oro=0

        //    CASO D: Pokemon, kills=7, muertes=0, asist=4, tiempo=50, obj=2, desc=false, dañoH=5000, dañoR=800, oro=800

        //    CASO E: (cualquier juego), desconexion=true, tiempoMin=3

        //

        // ------------------------------------------------------------

        // 7) EXTENSIONES OPCIONALES (sube dificultad):

        //    - Suma un "score" total: +10 por logro normal, +20 por logros PRO.

        //    - Si score ≥ 40 y no hubo Rage Quit → "MVP de la jornada 🏆".

        //    - Si dañoRecibido == 0 y tiempoMin ≥ 30 → "Perfect Defense 🧱".

        //    - Si (juego == "LoL" || juego == "Fortnite") && (kills + asistencias) ≥ 25 → "Impacto masivo 🌪".

        //    - Prioriza validaciones: AFK y Rage Quit antes que el resto.

        //    - Usa if anidados para practicar flujo de decisión.

        //

        // ------------------------------------------------------------

        // PISTAS TÉCNICAS:

        //    - Usa double para KDA (decimales).

        //    - Usa Math.max(1, muertes) para evitar dividir por cero.

        //    - Estructura tu código por bloques: validaciones iniciales → KDA → logros básicos → logros por juego → extras.

        //

        // ------------------------------------------------------------

        // IMPLEMENTACIÓN:

        //  - Escribe debajo tu solución con muchos if/else if/else.

        //  - No uses arrays ni bucles (opcional), céntrate en condiciones.

        //  - Ejecuta varias veces cambiando los valores de entrada.


        // ======= TU CÓDIGO AQUÍ =======
        /* Plan: crear variables booleana para cada logro/ set de logros
        Ejemplo: 2 bool menos5Min y hayDesconexion y esto sería para el logro
        de ragequit
        Para los distintos juegos se puede hacer un If que tenga dentro todos
        los logros del juego correspondiente y que se checkee antes del resto
        de los logros
         */
        //Variables
        String juego = "Pokemon";
        int kills = 7;
        int muertes = 0;
        int asistencias = 4;
        int tiempoMin = 3;
        int objetivos = 2;
        int dmgDealt = 5000;
        int dmgRecieved = 800;
        int oro = 800;
        boolean desconexion = true;

        //Operaciones
        double kda = (double) (kills + asistencias) / Math.max(1, muertes);

        //Checkeo de logros
        boolean rageQuit = (desconexion && (tiempoMin < 5));

        //Resumen de estadísticas
        System.out.println("      ESTADÍSTICAS");
        System.out.println("Partida de: " + juego);
        System.out.println("Kills: " + kills);
        System.out.println("Muertes: " + muertes);
        System.out.println("Asistencias: " + asistencias);
        System.out.println("Tiempo jugado: " + tiempoMin + " minutos");
        System.out.println("Objetivos tomados: " + objetivos);
        System.out.println("Daño hecho: " + dmgDealt);
        System.out.println("Daño recibido: " + dmgRecieved);
        System.out.println("Oro conseguido: " + oro);


        //Logros

        //AFK
        if(muertes == 0 && kills == 0 && asistencias == 0 && tiempoMin <2){
            System.out.println("Partida inválida: AFK");
        }else{
            //Ragequit, no entiendo super bien que hacer con el resto de "logros pro"
            System.out.println("KDA: " + kda);
            if(rageQuit){
                System.out.println("Logro NEGATIVO: Rage Quit \uD83D\uDE20");
                if( kda > 5){
                    System.out.println("Debido a RQ, no obtuviste el logro de Jugador PRO");

                }
            }

            //Logros de KDA
            if(kda >= 1){
                if(kda >= 5 && !rageQuit) {
                    System.out.println("Jugador PRO");
                }else if((3 <= kda) && (kda < 5)){
                    System.out.println("Jugador BUENO");
                }else if(1 <= kda && kda < 3){
                    System.out.println("Jugador NORMAL");
                }
            }else{
                System.out.println("Jugador NOOB");
            }

            //Logros básicos
            if(kills >= 10){
                System.out.println("Logro: Cazador experto \uD83C\uDFF9");
            }
            if(muertes == 0 && kills >= 5){
                System.out.println("Logro: Intocable \uD83D\uDC51");
            }
            if(tiempoMin > 60){
                System.out.println("Logro: Maratón gamer ⏱");
            }
            if(dmgDealt > dmgRecieved *2){
                System.out.println("Logro: Dominio total \uD83D\uDCA5");
            }
            if(objetivos >= 3){
                System.out.println("Logro: Objetivos de mapa \uD83C\uDFAF");
            }

            //Logros por juego
            if(juego == "Fortnite"){
                if(kills >= 15 && muertes <= 2){
                    System.out.println("Victoria agresiva (Fortnite) \uD83D\uDD2B");
                }
                if(oro >= 2000){
                    System.out.println("Ahorrista de V-Bucks (Fortnite) \uD83D\uDCB0");
                }
            }else if(juego == "Lol"){
                if(objetivos >= 2 && asistencias >= 10){
                    System.out.println("Shotcaller (LoL) \uD83D\uDDE3");
                }
                if(dmgDealt >= 30000 && muertes <= 3){
                    System.out.println("Carry principal (LoL) \uD83D\uDEE1");
                }
            }else if(juego == "Minecraft"){
                if(tiempoMin >= 45 && dmgRecieved == 0){
                    System.out.println("Superviviente pacífico (MC) \uD83C\uDF3F");
                }
                if(objetivos >=5){
                    System.out.println("Constructor incansable (MC) \uD83E\uDDF1");
                }
            }else if(juego == "Pokemon"){
                if(kills >= 6 && dmgRecieved <= 1000){
                    System.out.println("Entrenador maestro (PKMN) \uD83E\uDDE2");
                }
                if(asistencias >= 3){
                    System.out.println("Apoyo del equipo (PKMN) \uD83E\uDD1D");
                }
            }
        }

    }

}