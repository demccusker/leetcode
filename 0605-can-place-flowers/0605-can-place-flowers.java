class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowersPlantable = 0;
        for (int i = 0; i < flowerbed.length; i++) {
        if (i == 0 && flowerbed.length == 1) {
            if (flowerbed[0] == 0) {
                flowersPlantable++;
            }
            
        }
        else if (i == 0 && flowerbed.length > 1) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                flowersPlantable++;
                flowerbed[0] = 1;

            }
        }
        else if (i == flowerbed.length - 1) {
            if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
                flowersPlantable++;
            }
        }
        else {
            if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
                flowerbed[i] = 1;
                flowersPlantable++;
            }
        }
        
    }
    return n <= flowersPlantable;
    }
}