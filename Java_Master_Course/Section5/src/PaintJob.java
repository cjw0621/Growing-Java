public class PaintJob {

    //Returns required bucket count
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0 ) {
            return -1;
        } else {
            //Enter code here

            double numOfBuckets = ((width * height) / areaPerBucket) - extraBuckets;

            return (int) Math.ceil(numOfBuckets);
        }
    }

    //returns extra bucket count
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            //Enter code here
            double numOfBuckets = width * height / areaPerBucket;

            return (int) Math.ceil(numOfBuckets);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0 || areaPerBucket <= 0) {
            return -1;
        } else {
            //Enter code here

            double num = area / areaPerBucket;

            return (int) Math.ceil(num);
        }
    }

    public static void main(String[] args) {

        System.out.println(getBucketCount(-2.75,3.25,2.5,1));

    }

}
