package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Joc {
    // game's matrix
    int[][] m = new int[4][4];

    // fill matrix entries with random numbers from 0 to 15 for a new game
    Joc() {
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<16;i++) {
            a.add(i);
        }
        Collections.shuffle(a);
        for(int i=0;i<16;i++){
            m[i/4][i%4] = a.get(i);
        }
    }

    // position of zero in matrix
    int[] v = new int[2];

    void searchZero(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (m[i][j] == 0) {
                    v[0] = i;
                    v[1] = j;
                }
            }
        }
    }

    //change only if positions are close
    void change(int i, int j){
        if(((i==v[0])&&((j==v[1]+1)||(j==v[1]-1)))||((j==v[1])&&((i==v[0]-1)||(i==v[0]+1)))) {
            m[v[0]][v[1]] = m[i][j];
            m[i][j] = 0;
        }
    }
    //check if matrix entries are in order ,return true if they are.
    boolean stopJoc() {
        if(m[3][3]!=0) return false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i!=3&&j!=3) {
                    if (m[i][j] != (i * 4 + j) + 1) return false;
                }
            }
        }
        return true;

    }
}

