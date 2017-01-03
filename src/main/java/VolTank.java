/**
 * Created by supersupa on 2016. 11. 10..
 *
 * Tank Truck
 * https://www.codewars.com/kata/55f3da49e83ca1ddae0000ad/train/java
 * 6kyu
 */
public class VolTank {
    public static int tankVol(int h, int d, int vt) {
        double vl = 0;
        double _vh = (4 * vt) / ( d * d * Math.PI); // 실린더 높이
        double _theta = 0; // 중심각
        double _arcS =  0; // 부채꼴 넓이
        double _triS =  0; // 삼각형 넓이

        _theta = Math.atan( 2 * Math.sqrt( (h * d)  - (h * h)) / ( d - ( 2 * h) ) );
        if (h <= d/2) {
            _arcS =  d * d * _theta / 4;
            _triS = d * d * Math.sin(2 * _theta) / 8;
            vl = _vh * (_arcS - _triS);
        } else {
            _theta = - 1 * _theta;
            _arcS =  d * d * ( Math.PI - _theta) / 4;
            _triS = d * d * Math.sin(2 * _theta) / 8;
            vl = _vh * (_arcS + _triS);
        }

        // your code
        return (int) vl;
    }
}
