public static int getMaxPathSum() {
        for (int i = inputtriangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < inputtriangle[i].length; j++) {
                inputtriangle[i][j] += Math.max(inputtriangle[i + 1][j], inputtriangle[i + 1][j + 1]);
            }
        }
        return inputtriangle[0][0];
   }
