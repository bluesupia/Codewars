/**
 * Created by supersupa on 2016. 11. 10..
 *
 * Tank Truck
 * https://www.codewars.com/kata/55f3da49e83ca1ddae0000ad/train/java
 * 6kyu
 */
public class VolTank {
    public static int tankVol(int h, int d, int vt) {
        // 삼각함수의 배각공식 : sin2θ=2sinθcosθ
        // 삼각함수의 대칭공식 : sin(PI - θ) = sinθ, cos(PI - θ) = -cosθ
        double _cos  = 1.0 - ( 2.0 * h / d);
        double _theta = Math.acos(_cos);
        double vl = vt * ( _theta  -  Math.sin(_theta) * Math.cos(_theta) ) / Math.PI;
        return (int) vl;
    }
}
