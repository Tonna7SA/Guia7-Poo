package Sevicio;

import Entidades.Armadura;
import java.util.Scanner;

public class ArmaduraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Armadura a = new Armadura();
    int Matriz[][] = new int[10][5];

    public void estado() {

        System.out.println("El estado de la bota derecha es: " + a.getBotaDerecha() + "%");
        System.out.println("El estado de la bota izquierda es: " + a.getBotaIzquierda() + "%");
        System.out.println("El estado del guante derecho es: " + a.getGuanteDerecho() + "%");
        System.out.println("El estado del guante izquierdo es: " + a.getGuanteIzquierdo() + "%");
        System.out.println("El estado de la consola es: " + a.getConsola() + "%");
        System.out.println("El estado del sintetizador es: " + a.getSintetizador() + "%");
        System.out.println("El estado de salud es " + a.getNivelSalud() + "%");
        System.out.println("..................................");
        System.out.println("");

    }

    public void estadoBateria() {
        System.out.println("El estado de la batería es: " + a.getBateria() + "%");
        System.out.println("..................................");
        System.out.println("");
    }

    public void infoReactor() {
        System.out.println("El estado del reactor es " + a.getReactor1() + " Joules");
        System.out.println("El estado del reactor es " + a.getReactor2() + " Calorías");
        System.out.println("..................................");
        System.out.println("");
    }

    public void sufriendoDaniosBotasIzquierda() {
        int zapatoIzquierdo = ((int) (Math.random() * 10));
        System.out.println(zapatoIzquierdo);
        if (zapatoIzquierdo <= 2) {
            a.botaIzquierdaOk = false;
            System.out.println("La bota izquierda está rota  -  sufriendoDanios");
            a.setBotaIzquierda(0);
        } else {
            System.out.println("La bota izquierda está ok  -  sufriendoDanios");
        }
        System.out.println("..................................");
        System.out.println("");
    }

    public void sufriendoDaniosBotasDerecha() {
        int zapatoDerecho = ((int) (Math.random() * 10));
        System.out.println(zapatoDerecho);
        if (zapatoDerecho <= 2) {
            a.botaDerechaOk = false;
            System.out.println("La bota derecha está rota  -  sufriendoDanios");
            a.setBotaDerecha(0);
        } else {
            System.out.println("La bota derecha está ok  -  sufriendoDanios");
        }
        System.out.println("..................................");
        System.out.println("");
    }

    public void sufriendoDaniosGuantesDerecho() {
        int manoDerecho = ((int) (Math.random() * 10));
        System.out.println(manoDerecho);
        if (manoDerecho <= 2) {
            a.guanteDerechoOk = false;
            System.out.println("El guante derecho está roto  -  sufriendoDanios");
            a.setGuanteDerecho(0);
        } else {
            System.out.println("El guante derecho está ok  -  sufriendoDanios");
        }
        System.out.println("..................................");
        System.out.println("");
    }

    public void sufriendoDaniosGuantesIzquierdo() {
        int manoIzquierdo = ((int) (Math.random() * 10));
        System.out.println(manoIzquierdo);
        if (manoIzquierdo <= 2) {
            a.guanteIzquierdoOk = false;
            System.out.println("El guante izquierdo está roto  -  sufriendoDanios");
            a.setGuanteIzquierdo(0);
        } else {
            System.out.println("El guante izqierdo está ok  -  sufriendoDanios");
        }
        System.out.println("..................................");
        System.out.println("");
    }

    public void sufriendoDaniosConsola() {
        int conso = ((int) (Math.random() * 10));
        System.out.println(conso);
        if (conso <= 2) {
            a.consolaOk = false;
            System.out.println("La consola está rota  -  sufriendoDanios");
            a.setConsola(0);
        } else {
            System.out.println("La consola está ok  -  sufriendoDanios");
        }
        System.out.println("..................................");
        System.out.println("");
    }

    public void sufriendoDaniosSintetizador() {
        int sinte = ((int) (Math.random() * 10));
        System.out.println(sinte);
        if (sinte <= 2) {
            a.sintetizadorOk = false;
            System.out.println("El sintetizador está roto  -  sufriendoDanios");
            a.setSintetizador(0);
        } else {
            System.out.println("El sintetizador derecho está ok  -  sufriendoDanios");
        }
        System.out.println("..................................");
        System.out.println("");
    }

    public void sufriendoDaniosSalud() {
        int hp = ((int) (Math.random() * 10));
        System.out.println(hp);
        if (hp <= 2) {
            a.nivelSaludOk = false;
            System.out.println("El nivel de salud es ineficiente  -  sufriendoDanios");
            a.setNivelSalud(0);
        } else {
            System.out.println("El nivel de salud es eficiente  -  sufriendoDanios");
        }
        System.out.println("..................................");
        System.out.println("");
    }

    public void reparandoDaniosGuantesIzquierdo() {
        if (a.isGuanteIzquierdoOk()) {
            if (a.getGuanteIzquierdo() == 0) {
                if ((int) (Math.random() * 10) <= 4) {
                    System.out.println("Se reparó el guante izquierdo  -  reparandoDanios");
                    a.setGuanteIzquierdo(100);
                } else {
                    System.out.println("El guante izquierdo sigue roto  -  reparandoDanios");
                }
            }
        } else {
            System.out.println("No te había dicho que se rompió?? -  Guante izquierdo");
        }
    }

    public void reparandoDaniosGuantesDerecho() {
        if (a.isGuanteDerechoOk()) {
            if (a.getGuanteDerecho() == 0) {
                if ((int) (Math.random() * 10) <= 4) {
                    System.out.println("Se reparó el guante derecho  -  reparandoDanios");
                    a.setGuanteDerecho(100);
                } else {
                    System.out.println("El guante derecho sigue roto  -  reparandoDanios");
                }
            }
        } else {
            System.out.println("No te había dicho que se rompió?? -  Guante derecho");
        }
    }

    public void reparandoDaniosSalud() {
        if (a.isNivelSaludOk()) {
            if (a.getNivelSalud() == 0) {
                if ((int) (Math.random() * 10) <= 4) {
                    System.out.println("El nivel de salud se recuperó  -  reparandoDanios");
                    a.setNivelSalud(100);
                } else {
                    System.out.println("El estado de salud sigue siendo ineficiente  -  reparandoDanios");
                }
            }
        } else {
            System.out.println("No te había dicho que se murió?");
        }
    }

    public void reparandoDaniosSintetizador() {
        if (a.isSintetizadorOk()) {
            if (a.getSintetizador() == 0) {
                if ((int) (Math.random() * 10) <= 4) {
                    System.out.println("Se reparó el sintetizador  -  reparandoDanios");
                    a.setSintetizador(100);
                } else {
                    System.out.println("El sintetizador sigue roto  -  reparandoDanios");
                }
            }
        } else {
            System.out.println("No te había dicho que se rompió?? El sintetizador");
        }
    }

    public void reparandoDaniosConsola() {
        if (a.isConsolaOk()) {
            if (a.getConsola() == 0) {
                if ((int) (Math.random() * 10) <= 4) {
                    System.out.println("Se reparó la consola  -  reparandoDanios");
                    a.setConsola(100);
                } else {
                    System.out.println("La consola sigue rota  -  reparandoDanios");
                }
            }
        } else {
            System.out.println("No te había dicho que se rompió?? La consola");
        }
    }

    public void reparandoDaniosBotasIzquierdo() {
        if (a.isBotaIzquierdaOk()) {
            if (a.getBotaIzquierda() == 0) {
                if ((int) (Math.random() * 10) <= 4) {
                    System.out.println("Se reparó la bota izquierda  -  reparandoDanios");
                    a.setBotaIzquierda(100);
                } else {
                    System.out.println("La bota izquierda sigue rota  -  reparandoDanios");
                }
            }
        } else {
            System.out.println("No te había dicho que se rompió?? La bota izquierda");
        }
    }

    public void reparandoDaniosBotasDerecha() {
        if (a.isBotaDerechaOk()) {
            if (a.getBotaDerecha() == 0) {
                if ((int) (Math.random() * 10) <= 4) {
                    System.out.println("Se reparó la bota derecha  -  reparandoDanios");
                    a.setBotaDerecha(100);
                } else {
                    System.out.println("La bota derecha sigue rota  -  reparandoDanios");
                }
            }
        } else {
            System.out.println("No te había dicho que se rompió?? La bota derecha");
        }
    }

    public void revisarDispositivo() {
        int intento = 0;

        do {
            if (a.isBotaDerechaOk()) {
                reparandoDaniosBotasDerecha();
            }
            if (a.isBotaIzquierdaOk()) {
                reparandoDaniosBotasIzquierdo();
            }
            if (a.isGuanteDerechoOk()) {
                reparandoDaniosGuantesDerecho();
            }
            if (a.isGuanteIzquierdoOk()) {
                reparandoDaniosGuantesIzquierdo();
            }
            if (a.isConsolaOk()) {
                reparandoDaniosConsola();
            }
            if (a.isEnergiaOk()) {
                reparandoDaniosSalud();
            }
            if (a.isSintetizadorOk()) {
                reparandoDaniosSintetizador();
            }
            intento = ((int) (Math.random() * 10));
        } while (intento == 1 || intento == 7 || intento == 5 || intento == 4 || intento == 9 || intento == 3 || intento == 6);

        if (a.getBotaDerecha() == 0) {
            System.out.println("Se rompió para siempre la bota derecha");
            a.setBotaDerechaOk(false);
        }

        if (a.getBotaIzquierda() == 0) {
            System.out.println("Se rompió para siempre la bota izquierda");
            a.setBotaIzquierdaOk(false);
        }

        if (a.getGuanteDerecho() == 0) {
            System.out.println("Se rompió para siempre el guante derecho");
            a.setGuanteDerechoOk(false);
        }

        if (a.getGuanteIzquierdo() == 0) {
            System.out.println("Se rompió para siempre el guante izquierdo");
            a.setGuanteIzquierdoOk(false);
        }

        if (a.getConsola() == 0) {
            System.out.println("Se rompió la consola para siempre");
            a.setConsolaOk(false);
        }

        if (a.getNivelSalud() == 0) {
            System.out.println("Se murió");
            a.setNivelSaludOk(false);
        }

        if (a.getSintetizador() == 0) {
            System.out.println("Se rompió el sintetizador para siemre");
            a.setSintetizadorOk(false);
        }
    }

    public void gastarEnergiaCaminar() {
        int minutos;
        if (a.isBotaDerechaOk() || a.isBotaIzquierdaOk()) {
            System.out.println("Cuánto tiempo vas a estar caminando (en minutos)?");
            minutos = leer.nextInt();
            a.setReactor1(a.getReactor1() - (minutos / 10));
            a.setReactor2(a.getReactor2() - ((minutos / 10) * 0.2389));
            System.out.println("Te quedan " + a.getReactor1() + " Joules");
            System.out.println("Te quedan " + a.getReactor2() + " Calorías");
            if (a.isBotaDerechaOk()) {
                a.setBotaDerecha(a.getBotaDerecha() - (minutos * 10));
                a.setConsola(a.getConsola() - (minutos * 2));
                System.out.println("Te queda " + a.getBotaDerecha() + "% de energía en la bota derecha");
            } else {
                System.out.println("Está rota, no se usa más la bota derecha");
            }
            if (a.isBotaIzquierdaOk()) {
                a.setBotaIzquierda(a.getBotaIzquierda() - (minutos * 10));
                System.out.println("Te queda " + a.getBotaIzquierda() + "% de energía en la bota izquierda");
            } else {
                System.out.println("Está rota, no se usa más la bota izquierda");
            }
        } else {
            System.out.println("Sin piernas, no podés caminar");
        }
    }

    public void gastarEnergiaCorrer() {
        int minutos;
        if (a.isBotaDerechaOk() || a.isBotaIzquierdaOk()) {
            System.out.println("Cuánto tiempo vas a estar corriendo (en minutos)?");
            minutos = leer.nextInt();
            a.setReactor1(a.getReactor1() - (minutos / 5));
            a.setReactor2(a.getReactor2() - ((minutos / 5) * 0.2389));
            System.out.println("Te quedan " + a.getReactor1() + " Joules");
            System.out.println("Te quedan " + a.getReactor2() + " Calorías");
            if (a.isBotaDerechaOk()) {
                a.setBotaDerecha(a.getBotaDerecha() - (minutos * 20));
                System.out.println("Te queda " + a.getBotaDerecha() + "% de energía en la bota derecha");
            } else {
                System.out.println("Está rota, no se usa más la bota derecha");
            }
            if (a.isBotaIzquierdaOk()) {
                a.setBotaIzquierda(a.getBotaIzquierda() - (minutos * 20));
                System.out.println("Te queda " + a.getBotaIzquierda() + "% de energía en la bota izquierda");
            } else {
                System.out.println("Está rota, no se usa más la bota izquierda");
            }
        } else {
            System.out.println("Sin piernas, no podés caminar");
        }
    }

    public void gasterEnergiaVolar() {
        int minutos;
        if ((a.isBotaDerechaOk() || a.isBotaIzquierdaOk() && (a.isGuanteDerechoOk() || a.isGuanteIzquierdoOk()))) {
            System.out.println("Cuántos minutos vas a estar volando?");
            minutos = leer.nextInt();
            a.setReactor1(a.getReactor1() - (minutos / 5));
            a.setReactor2(a.getReactor2() - ((minutos / 5) * 0.2389));
            System.out.println("Te quedan " + a.getReactor1() + " Joules");
            System.out.println("Te quedan " + a.getReactor2() + " Calorías");
            if (a.isBotaDerechaOk()) {
                a.setBotaDerecha(a.getBotaDerecha() - (minutos * 30));
                System.out.println("Te queda " + a.getBotaDerecha() + "% de energía en la bota derecha");

            } else {
                System.out.println("Está rota, no se usa más la bota derecha");
            }
            if (a.isBotaIzquierdaOk()) {
                a.setBotaIzquierda(a.getBotaIzquierda() - (minutos * 30));
                System.out.println("Te queda " + a.getBotaIzquierda() + "% de energía en la bota izquierda");
            } else {
                System.out.println("Está rota, no se usa más la bota izquierda");
            }
            if (a.isGuanteDerechoOk()) {
                a.setGuanteDerecho(a.getGuanteDerecho() - (minutos * 20));
                System.out.println("Te queda " + a.getGuanteDerecho() + "% de energía en el guante derecho");
            } else {
                System.out.println("Está roto, el guante derecho no se usa más");
            }
            if (a.isGuanteIzquierdoOk()) {
                a.setGuanteIzquierdo(a.getGuanteIzquierdo() - (minutos * 20));
                System.out.println("Te queda " + a.getGuanteIzquierdo() + "% de energía en el guante derecho");
            } else {
                System.out.println("Está roto, el guante izquierdo no se usa más");
            }

        } else {
            System.out.println("Sin tele y sin cerveza homero pierde la cabeza");
            System.out.println("Si no andan los guantes o las botas, no podés volar. Necesitas al menos uno de cada uno");
        }
    }

    public void gastarEnergiaPropulsar() {
        int minutos;
        if (a.isBotaDerechaOk() && a.isBotaIzquierdaOk()) {
            System.out.println("Cuántos minutos vas a estar propulsandote?");
            minutos = leer.nextInt();
            a.setReactor1(a.getReactor1() - (minutos / 2.5));
            a.setReactor2(a.getReactor2() - ((minutos / 2.5) * 0.2389));
            System.out.println("Te quedan " + a.getReactor1() + " Joules");
            System.out.println("Te quedan " + a.getReactor2() + " Calorías");
            if (a.isBotaDerechaOk()) {
                a.setBotaDerecha(a.getBotaDerecha() - (minutos * 30));
                System.out.println("Te queda " + a.getBotaDerecha() + "% de energía en la bota derecha");
            } else {
                System.out.println("Está rota, no se usa más la bota derecha");
            }
            if (a.isBotaIzquierdaOk()) {
                a.setBotaIzquierda(a.getBotaIzquierda() - (minutos * 30));
                System.out.println("Te queda " + a.getBotaIzquierda() + "% de energía en la bota izquierda");
            } else {
                System.out.println("Está rota, no se usa más la bota izquierda");
            }
        } else {
            System.out.println("Necesitas las 2 botas para propulsarte, zuperutano");
        }
    }

    public void guantesDisparar() {
        int segundos;
        if (a.isGuanteDerechoOk() || a.isGuanteIzquierdoOk()) {
            System.out.println("Cuántos segundos va a estar disparando?");
            segundos = leer.nextInt();
            a.setReactor1(a.getReactor1() - (segundos / 20));
            a.setReactor2(a.getReactor2() - ((segundos / 20) * 0.2389));
            System.out.println("Te quedan " + a.getReactor1() + " Joules");
            System.out.println("Te quedan " + a.getReactor2() + " Calorías");
            if (a.isGuanteDerechoOk()) {
                a.setGuanteDerecho(a.getGuanteDerecho() - (segundos));
                System.out.println("Te queda " + a.getGuanteDerecho() + "% de energía en el guante derecho");
            } else {
                System.out.println("Está roto, no se usa más el guante derecho");
            }
            if (a.isGuanteIzquierdoOk()) {
                a.setGuanteIzquierdo(a.getGuanteIzquierdo() - (segundos));
                System.out.println("Te queda " + a.getGuanteIzquierdo() + "% de energía en el guante izquierdo");
            } else {
                System.out.println("Está roto, no se usa más el guante izquierdo");
            }
        }
    }

    public void radar() {
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0, z1 = 0, z2 = 0;
        double distancia = 0;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    x2 = (int) (Math.random() * (10 - (-10)) + (-10));
                    Matriz[i][j] = x2;
                }
                if (j == 1) {
                    y2 = (int) (Math.random() * (10 - (-10)) + (-10));
                    Matriz[i][j] = y2;
                }
                if (j == 2) {
                    z2 = (int) (Math.random() * (10 - (-10)) + (-10));
                    Matriz[i][j] = z2;
                }
                if (j == 3) {
                    distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2));
                    Matriz[i][j] = (int) distancia;
                }
                if (j == 4) {
                    Matriz[i][j] = (int) (Math.random() * 2);
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Objetivo " + (i + 1) + "...");
            for (int j = 0; j < 5; j++) {
                if (j < 4) {
                    System.out.print("[" + Matriz[i][j] + "]");
                }
                if (j == 4) {
                    if (Matriz[i][j] == 0) {
                        System.out.print("Es un forro, matalo!!!");
                    } else {
                        System.out.print("Ayyyyy, es un bambi. Vamos con el bambi");
                    }
                }
            }
            System.out.println(" ");
        }
    }

    public void destruyendoEnemigo() {
        int resistencia = (int) (Math.random() * 10);
        int disparos = 0;

        if (a.isGuanteDerechoOk() && a.isGuanteIzquierdoOk()) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 5; j++) {
                    if (j == 4) {
                        if (Matriz[i][j] == 0) {
                            if (Matriz[i][j - 1] <= 5) {
                                System.out.println("Es malo y está cerca. Pegale un corchazo");
                                if (Matriz[i][j - 1] == 5) {
                                    resistencia = 10;
                                    System.out.println("Su resistencia es igual a " + resistencia + " sigue vivo");
                                }
                                if (Matriz[i][j - 1] == 4) {
                                    resistencia = 8;
                                    System.out.println("Su resistencia es igual a " + resistencia + " vivo, pero herido");
                                }
                                if (Matriz[i][j - 1] == 3) {
                                    resistencia = 6;
                                    System.out.println("Su resistencia es igual a " + resistencia + " vivo, pero medio hecho pelota");
                                }
                                if (Matriz[i][j - 1] == 2) {
                                    resistencia = 4;
                                    System.out.println("Su resistencia es igual a " + resistencia + " vivo, pero hecho percha");
                                }
                                if (Matriz[i][j - 1] == 1) {
                                    resistencia = 2;
                                    System.out.println("Su resistencia es igual a " + resistencia + " se murió el muy hdp");
                                }
                                if (Matriz[i][j - 1] == 0) {
                                    resistencia = 0;
                                    System.out.println("Su resistencia es igual a " + resistencia + "");
                                }
                            } else {
                                System.out.println("Está lejos. Se te escapó la tortuga");
                            }
                        }
                    }
                }
            }

        } else if (a.isGuanteDerechoOk() || a.isGuanteIzquierdoOk()) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 5; j++) {
                    if (j == 4) {
                        if (Matriz[i][j] == 0) {
                            if (Matriz[i][j - 1] <= 5) {
                                System.out.println("Es malo y está cerca. Pegale un corchazo");
                                if (Matriz[i][j - 1] == 5) {
                                    resistencia = 10;
                                    System.out.println("Su resistencia es igual a " + resistencia + " con un guante apenas le hacés cosquillas");
                                }
                                if (Matriz[i][j - 1] == 4) {
                                    resistencia = 9;
                                    System.out.println("Su resistencia es igual a " + resistencia + " con un guante apenas le hacés cosquillas");
                                }
                                if (Matriz[i][j - 1] == 3) {
                                    resistencia = 8;
                                    System.out.println("Su resistencia es igual a " + resistencia + " con un guante apenas le hacés cosquillas");
                                }
                                if (Matriz[i][j - 1] == 2) {
                                    resistencia = 7;
                                    System.out.println("Su resistencia es igual a " + resistencia + " con un guante apenas le hacés cosquillas");
                                }
                                if (Matriz[i][j - 1] == 1) {
                                    resistencia = 6;
                                    System.out.println("Su resistencia es igual a " + resistencia + " con un guante apenas le hacés cosquillas");
                                }
                                if (Matriz[i][j - 1] == 0) {
                                    resistencia = 5;
                                    System.out.println("Su resistencia es igual a " + resistencia + "");
                                }
                            } else {
                                System.out.println("Está lejos. Se te escapó la tortuga");
                            }
                        }
                    }
                }
            }
        }else{
            System.out.println("Tenés rotos los guantes");
        }
    }
}
