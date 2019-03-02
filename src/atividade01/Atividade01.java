package atividade01;

import java.util.Random;
import java.io.*;

public class Atividade01 {

    public static void main(String[] args) {
        int vetor1[] = new int[5];
        int vetor2[] = new int[10];
        int vetor3[] = new int[50];
        int vetor4[] = new int[100];
        int vetor5[] = new int[1000];
        int vetor6[] = new int[10000];
        Random r = new Random();
        try (FileOutputStream arquivoVetor = new FileOutputStream("vetor.txt")) {
            BufferedOutputStream bufferVetor = new BufferedOutputStream(arquivoVetor);
            String strVetor = "";
            bufferVetor.write("Vetor[5]:\n".getBytes());
            for (int i = 0; i < vetor1.length; i++) {
                vetor1[i] = r.nextInt(5);
                strVetor = vetor1[i] + "\n";
                bufferVetor.write(strVetor.getBytes());
            }
            bufferVetor.write("Vetor[10]:\n".getBytes());
            for (int i = 0; i < vetor2.length; i++) {
                vetor2[i] = r.nextInt(10);
                strVetor = vetor2[i] + "\n";
                bufferVetor.write(strVetor.getBytes());
            }
            bufferVetor.write("Vetor[50]:\n".getBytes());
            for (int i = 0; i < vetor3.length; i++) {
                vetor3[i] = r.nextInt(50);
                strVetor = vetor3[i] + "\n";
                bufferVetor.write(strVetor.getBytes());
            }
            bufferVetor.write("Vetor[100]:\n".getBytes());
            for (int i = 0; i < vetor4.length; i++) {
                vetor4[i] = r.nextInt(100);
                strVetor = vetor4[i] + "\n";
                bufferVetor.write(strVetor.getBytes());
            }
            bufferVetor.write("Vetor[1000]:\n".getBytes());
            for (int i = 0; i < vetor5.length; i++) {
                vetor5[i] = r.nextInt(1000);
                strVetor = vetor5[i] + "\n";
                bufferVetor.write(strVetor.getBytes());
            }
            bufferVetor.write("Vetor[10000]:\n".getBytes());
            for (int i = 0; i < vetor6.length; i++) {
                vetor6[i] = r.nextInt(10000);
                strVetor = vetor6[i] + "\n";
                bufferVetor.write(strVetor.getBytes());
            }
            bufferVetor.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try (FileOutputStream arquivoSaida = new FileOutputStream("saida.txt")) {
            BufferedOutputStream bufferSaida = new BufferedOutputStream(arquivoSaida);
            String strElapsed = "";
            String strCont = "";
            //Chama Bubble Sort:
            long startBS1 = System.currentTimeMillis();
            long contBS1 = bubbleSort(vetor1.clone());
            long elapsedBS1 = System.currentTimeMillis() - startBS1;
            strElapsed = "Tempo Bubble Sort: " + elapsedBS1 + "\n";
            strCont = "Número de iterações: " + contBS1 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startBS2 = System.currentTimeMillis();
            long contBS2 = bubbleSort(vetor2.clone());
            long elapsedBS2 = System.currentTimeMillis() - startBS2;
            strElapsed = "Tempo Bubble Sort: " + elapsedBS2 + "\n";
            strCont = "Número de iterações: " + contBS2 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startBS3 = System.currentTimeMillis();
            long contBS3 = bubbleSort(vetor3.clone());
            long elapsedBS3 = System.currentTimeMillis() - startBS3;
            strElapsed = "Tempo Bubble Sort: " + elapsedBS3 + "\n";
            strCont = "Número de iterações: " + contBS3 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startBS4 = System.currentTimeMillis();
            long contBS4 = bubbleSort(vetor4.clone());
            long elapsedBS4 = System.currentTimeMillis() - startBS4;
            strElapsed = "Tempo Bubble Sort: " + elapsedBS4 + "\n";
            strCont = "Número de iterações: " + contBS4 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startBS5 = System.currentTimeMillis();
            long contBS5 = bubbleSort(vetor5.clone());
            long elapsedBS5 = System.currentTimeMillis() - startBS5;
            strElapsed = "Tempo Bubble Sort: " + elapsedBS5 + "\n";
            strCont = "Número de iterações: " + contBS5 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startBS6 = System.currentTimeMillis();
            long contBS6 = bubbleSort(vetor6.clone());
            long elapsedBS6 = System.currentTimeMillis() - startBS6;
            strElapsed = "Tempo Bubble Sort: " + elapsedBS6 + "\n";
            strCont = "Número de iterações: " + contBS6 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            //Prints do Bubble Sort:
            for (int i = 0; i < vetor1.length; i++) {
                System.out.println(vetor1[i]);
            }
            for (int i = 0; i < vetor2.length; i++) {
                System.out.println(vetor2[i]);
            }
            for (int i = 0; i < vetor3.length; i++) {
                System.out.println(vetor3[i]);
            }
            for (int i = 0; i < vetor4.length; i++) {
                System.out.println(vetor4[i]);
            }
            for (int i = 0; i < vetor5.length; i++) {
                System.out.println(vetor5[i]);
            }
            for (int i = 0; i < vetor6.length; i++) {
                System.out.println(vetor6[i]);
            }
            //Chama Insertion Sort:
            long startIS1 = System.currentTimeMillis();
            long contIS1 = insertionSort(vetor1.clone());
            long elapsedIS1 = System.currentTimeMillis() - startIS1;
            strElapsed = "Tempo Insertion Sort: " + elapsedIS1 + "\n";
            strCont = "Número de iterações: " + contIS1 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startIS2 = System.currentTimeMillis();
            long contIS2 = insertionSort(vetor2.clone());
            long elapsedIS2 = System.currentTimeMillis() - startIS2;
            strElapsed = "Tempo Insertion Sort: " + elapsedIS2 + "\n";
            strCont = "Número de iterações: " + contIS2 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startIS3 = System.currentTimeMillis();
            long contIS3 = insertionSort(vetor3.clone());
            long elapsedIS3 = System.currentTimeMillis() - startIS3;
            strElapsed = "Tempo Insertion Sort: " + elapsedIS3 + "\n";
            strCont = "Número de iterações: " + contIS3 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startIS4 = System.currentTimeMillis();
            long contIS4 = insertionSort(vetor4.clone());
            long elapsedIS4 = System.currentTimeMillis() - startIS4;
            strElapsed = "Tempo Insertion Sort: " + elapsedIS4 + "\n";
            strCont = "Número de iterações: " + contIS4 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startIS5 = System.currentTimeMillis();
            long contIS5 = insertionSort(vetor5.clone());
            long elapsedIS5 = System.currentTimeMillis() - startIS5;
            strElapsed = "Tempo Insertion Sort: " + elapsedIS5 + "\n";
            strCont = "Número de iterações: " + contIS5 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startIS6 = System.currentTimeMillis();
            long contIS6 = insertionSort(vetor6.clone());
            long elapsedIS6 = System.currentTimeMillis() - startIS6;
            strElapsed = "Tempo Insertion Sort: " + elapsedIS6 + "\n";
            strCont = "Número de iterações: " + contIS6 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            //Prints do Insertion Sort:
            for (int i = 0; i < vetor1.length; i++) {
                System.out.println(vetor1[i]);
            }
            for (int i = 0; i < vetor2.length; i++) {
                System.out.println(vetor2[i]);
            }
            for (int i = 0; i < vetor3.length; i++) {
                System.out.println(vetor3[i]);
            }
            for (int i = 0; i < vetor4.length; i++) {
                System.out.println(vetor4[i]);
            }
            for (int i = 0; i < vetor5.length; i++) {
                System.out.println(vetor5[i]);
            }
            for (int i = 0; i < vetor6.length; i++) {
                System.out.println(vetor6[i]);
            }
            //Chama Selection Sort:
            long startSS1 = System.currentTimeMillis();
            long contSS1 = selectionSort(vetor1.clone());
            long elapsedSS1 = System.currentTimeMillis() - startSS1;
            strElapsed = "Tempo Selection Sort: " + elapsedSS1 + "\n";
            strCont = "Número de iterações: " + contSS1 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startSS2 = System.currentTimeMillis();
            long contSS2 = selectionSort(vetor2.clone());
            long elapsedSS2 = System.currentTimeMillis() - startSS2;
            strElapsed = "Tempo Selection Sort: " + elapsedSS2 + "\n";
            strCont = "Número de iterações: " + contSS2 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startSS3 = System.currentTimeMillis();
            long contSS3 = selectionSort(vetor3.clone());
            long elapsedSS3 = System.currentTimeMillis() - startSS3;
            strElapsed = "Tempo Selection Sort: " + elapsedSS3 + "\n";
            strCont = "Número de iterações: " + contSS3 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startSS4 = System.currentTimeMillis();
            long contSS4 = selectionSort(vetor4.clone());
            long elapsedSS4 = System.currentTimeMillis() - startSS4;
            strElapsed = "Tempo Selection Sort: " + elapsedSS4 + "\n";
            strCont = "Número de iterações: " + contSS4 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startSS5 = System.currentTimeMillis();
            long contSS5 = selectionSort(vetor5.clone());
            long elapsedSS5 = System.currentTimeMillis() - startSS5;
            strElapsed = "Tempo Selection Sort: " + elapsedSS5 + "\n";
            strCont = "Número de iterações: " + contSS5 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startSS6 = System.currentTimeMillis();
            long contSS6 = selectionSort(vetor6.clone());
            long elapsedSS6 = System.currentTimeMillis() - startSS6;
            strElapsed = "Tempo Selection Sort: " + elapsedSS6 + "\n";
            strCont = "Número de iterações: " + contSS6 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            //Prints do Selection Sort:
            for (int i = 0; i < vetor1.length; i++) {
                System.out.println(vetor1[i]);
            }
            for (int i = 0; i < vetor2.length; i++) {
                System.out.println(vetor2[i]);
            }
            for (int i = 0; i < vetor3.length; i++) {
                System.out.println(vetor3[i]);
            }
            for (int i = 0; i < vetor4.length; i++) {
                System.out.println(vetor4[i]);
            }
            for (int i = 0; i < vetor5.length; i++) {
                System.out.println(vetor5[i]);
            }
            for (int i = 0; i < vetor6.length; i++) {
                System.out.println(vetor6[i]);
            }
            //Chama Merge Sort:
            long startMS1 = System.currentTimeMillis();
            long contMS1 = mergeSort(vetor1.clone(), 0, vetor1.length - 1);
            long elapsedMS1 = System.currentTimeMillis() - startMS1;
            strElapsed = "Tempo Merge Sort: " + elapsedMS1 + "\n";
            strCont = "Número de iterações: " + contMS1 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startMS2 = System.currentTimeMillis();
            long contMS2 = mergeSort(vetor2.clone(), 0, vetor2.length - 1);
            long elapsedMS2 = System.currentTimeMillis() - startMS2;
            strElapsed = "Tempo Merge Sort: " + elapsedMS2 + "\n";
            strCont = "Número de iterações: " + contMS2 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startMS3 = System.currentTimeMillis();
            long contMS3 = mergeSort(vetor3.clone(), 0, vetor3.length - 1);
            long elapsedMS3 = System.currentTimeMillis() - startMS3;
            strElapsed = "Tempo Merge Sort: " + elapsedMS3 + "\n";
            strCont = "Número de iterações: " + contMS3 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startMS4 = System.currentTimeMillis();
            long contMS4 = mergeSort(vetor4.clone(), 0, vetor4.length - 1);
            long elapsedMS4 = System.currentTimeMillis() - startMS4;
            strElapsed = "Tempo Merge Sort: " + elapsedMS4 + "\n";
            strCont = "Número de iterações: " + contMS4 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startMS5 = System.currentTimeMillis();
            long contMS5 = mergeSort(vetor5.clone(), 0, vetor5.length - 1);
            long elapsedMS5 = System.currentTimeMillis() - startMS5;
            strElapsed = "Tempo Merge Sort: " + elapsedMS5 + "\n";
            strCont = "Número de iterações: " + contMS5 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startMS6 = System.currentTimeMillis();
            long contMS6 = mergeSort(vetor6.clone(), 0, vetor6.length - 1);
            long elapsedMS6 = System.currentTimeMillis() - startMS6;
            strElapsed = "Tempo Merge Sort: " + elapsedMS6 + "\n";
            strCont = "Número de iterações: " + contMS6 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            //Prints do Merge Sort:
            for (int i = 0; i < vetor1.length; i++) {
                System.out.println(vetor1[i]);
            }
            for (int i = 0; i < vetor2.length; i++) {
                System.out.println(vetor2[i]);
            }
            for (int i = 0; i < vetor3.length; i++) {
                System.out.println(vetor3[i]);
            }
            for (int i = 0; i < vetor4.length; i++) {
                System.out.println(vetor4[i]);
            }
            for (int i = 0; i < vetor5.length; i++) {
                System.out.println(vetor5[i]);
            }
            for (int i = 0; i < vetor6.length; i++) {
                System.out.println(vetor6[i]);
            }
            //Chama Quick Sort:
            long startQS1 = System.currentTimeMillis();
            long contQS1 = quickSort(vetor1.clone(), 0, vetor1.length - 1);
            long elapsedQS1 = System.currentTimeMillis() - startQS1;
            strElapsed = "Tempo Quick Sort: " + elapsedQS1 + "\n";
            strCont = "Número de iterações: " + contQS1 + "\n";
            System.out.print(strElapsed);
            System.out.print(strCont);
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startQS2 = System.currentTimeMillis();
            long contQS2 = quickSort(vetor2.clone(), 0, vetor2.length - 1);
            long elapsedQS2 = System.currentTimeMillis() - startQS2;
            strElapsed = "Tempo Quick Sort: " + elapsedQS2 + "\n";
            strCont = "Número de iterações: " + contQS2 + "\n";
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startQS3 = System.currentTimeMillis();
            long contQS3 = quickSort(vetor3.clone(), 0, vetor3.length - 1);
            long elapsedQS3 = System.currentTimeMillis() - startQS3;
            strElapsed = "Tempo Quick Sort: " + elapsedQS3 + "\n";
            strCont = "Número de iterações: " + contQS3 + "\n";
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startQS4 = System.currentTimeMillis();
            long contQS4 = quickSort(vetor4.clone(), 0, vetor4.length - 1);
            long elapsedQS4 = System.currentTimeMillis() - startQS4;
            strElapsed = "Tempo Quick Sort: " + elapsedQS4 + "\n";
            strCont = "Número de iterações: " + contQS4 + "\n";
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startQS5 = System.currentTimeMillis();
            long contQS5 = quickSort(vetor5.clone(), 0, vetor5.length - 1);
            long elapsedQS5 = System.currentTimeMillis() - startQS5;
            strElapsed = "Tempo Quick Sort: " + elapsedQS5 + "\n";
            strCont = "Número de iterações: " + contQS5 + "\n";
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            long startQS6 = System.currentTimeMillis();
            long contQS6 = quickSort(vetor6.clone(), 0, vetor6.length - 1);
            long elapsedQS6 = System.currentTimeMillis() - startQS6;
            strElapsed = "Tempo Quick Sort: " + elapsedQS6 + "\n";
            strCont = "Número de iterações: " + contQS6 + "\n";
            bufferSaida.write(strElapsed.getBytes());
            bufferSaida.write(strCont.getBytes());
            //Prints do Quick Sort:
            for (int i = 0; i < vetor1.length; i++) {
                System.out.println(vetor1[i]);
            }
            for (int i = 0; i < vetor2.length; i++) {
                System.out.println(vetor2[i]);
            }
            for (int i = 0; i < vetor3.length; i++) {
                System.out.println(vetor3[i]);
            }
            for (int i = 0; i < vetor4.length; i++) {
                System.out.println(vetor4[i]);
            }
            for (int i = 0; i < vetor5.length; i++) {
                System.out.println(vetor5[i]);
            }
            for (int i = 0; i < vetor6.length; i++) {
                System.out.println(vetor6[i]);
            }
            bufferSaida.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static long bubbleSort(int vetor[]) {
        long contador = 0;
        int n = vetor.length;
        int temp;
        do {
            int newn = 0;
            for (int i = 1; i <= n - 1; i++) {
                contador++;
                if (vetor[i - 1] > vetor[i]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n > 0);
        return contador;
    }

    public static long insertionSort(int vetor[]) {
        long contador = 0;
        int aux;
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                contador++;
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        return contador;
    }

    public static long selectionSort(int vetor[]) {
        long contador = 0;
        int aux;
        for (int i = 0; i < vetor.length - 1; i++) {
            int indiceI = i;
            for (int j = i + 1; j < vetor.length; j++) {
                contador++;
                if (vetor[indiceI] > vetor[j]) {
                    indiceI = j;
                }
            }
            contador++;
            if (vetor[i] > vetor[indiceI]) {
                aux = vetor[i];
                vetor[i] = vetor[indiceI];
                vetor[indiceI] = aux;
            }
        }
        return contador;
    }

    private static long mergeSort(int[] vetor, int auxInicial, int auxFinal) {
        long contador = 0;
        int auxMeio;
        if (auxInicial < auxFinal) {
            auxMeio = (auxFinal + auxInicial) / 2;
            mergeSort(vetor, auxInicial, auxMeio);
            mergeSort(vetor, auxMeio + 1, auxFinal);
            contador = contador + intercala(vetor, auxInicial, auxMeio, auxFinal);
        }
        return contador;
    }

    private static long intercala(int[] vetor, int auxInicial, int auxMeio, int auxFinal) {
        long contador = 0;
        int[] vetor2 = new int[vetor.length];

        for (int i = auxInicial; i <= auxMeio; i++) {
            vetor2[i] = vetor[i];
        }

        for (int j = auxMeio + 1; j <= auxFinal; j++) {
            vetor2[auxFinal + auxMeio + 1 - j] = vetor[j];
        }
        int i = auxInicial;
        int j = auxFinal;

        for (int k = auxInicial; k <= auxFinal; k++) {
            contador++;
            if (vetor2[i] <= vetor2[j]) {
                vetor[k] = vetor2[i];
                i = i + 1;
            } else {
                vetor[k] = vetor2[j];
                j = j - 1;
                contador++;
            }
        }
        return contador;
    }

    public static long quickSort(int vet[], int inicio, int fim) {
        long contador = 0;
        if (inicio < fim) {
            int vetor[] = particionar(vet, inicio, fim);
            contador += vetor[0];
            int meio = vetor[1];
            quickSort(vet, inicio, meio - 1);
            quickSort(vet, meio + 1, fim);
        }
        return contador;
    }

    private static int[] particionar(int[] vet, int inicio, int fim) {
        int vetor[] = new int[2];
        int i = inicio + 1;
        int j = fim;
        int aux;
        while (i <= j) {
            vetor[0]++;
            if (vet[i] < vet[inicio]) {
                i++;
            } else {
                vetor[0]++;
                if (vet[j] > vet[inicio]) {
                    j--;
                } else {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                    i++;
                    j--;
                }
            }
        }
        aux = vet[inicio];
        vet[inicio] = vet[j];
        vet[j] = aux;
        vetor[1] = j;
        return vetor;
    }

}
