public class PaintJob {

    public static void main(String[] args) {

       //System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
       //System.out.println(getBucketCount(7.25, 4.3, 2.35));
       // System.out.println(getBucketCount(3.26, 0.75));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {

            return -1;

        } else {

            double currentArea = 0;
            int buckets = 0;
            for (int i = 1; currentArea <= (width * height) ;i++) {

                currentArea = areaPerBucket * i;
                buckets = i;

            }

            return buckets - extraBuckets;

        }

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {

            return -1;

        } else {

            double currentArea = 0;
            int buckets = 0;
            for (int i = 1; currentArea <= (width * height) ;i++) {

                currentArea = areaPerBucket * i;
                buckets = i;

            }

            return buckets;

        }

    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {

            return -1;

        } else {

            double currentArea = 0;
            int buckets = 0;
            for (int i = 1; currentArea <= area ;i++) {

                currentArea = areaPerBucket * i;
                buckets = i;

            }

            return buckets;

        }

    }

}

// Math.ceil