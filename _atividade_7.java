ble[] n1 = {10.5, 8.0, 12.3, 7.4, 15.0, 9.1, 6.5, 11.2, 13.8, 5.2};

        double sum = 0;
        int c = 0;

        for (double n2 : n1) {
            sum += n2;
        }

        double media = sum / n1.length;

        for (double num : n1) {
            if (num > media) {
                c++;
            }
        }

        System.out.printf("A média aritmética dos valores é: %.2f%n", media);
        System.out.println("E a quantidade de valores acima da média é: "+c);
    }
}
