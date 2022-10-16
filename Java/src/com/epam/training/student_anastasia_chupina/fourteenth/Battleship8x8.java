package com.epam.training.student_anastasia_chupina.fourteenth;

public class Battleship8x8 {
    private final long ships;
    private long shots = 0L;

    public Battleship8x8(final long ships) {
        this.ships = ships;
    }

    public boolean shoot(String shot) {
        int x = 7 - (shot.charAt(0) - 'A');
        int y = 7 - (shot.charAt(1) - '1');
        int i = x + 8*y;
        long placeOfShot = 1L << i;
        if ((placeOfShot&ships) == placeOfShot) {
            shots = placeOfShot|shots;
            return true;
        }
        shots = placeOfShot|shots;
        return false;
    }

    public String state() {
        StringBuilder b1 = new StringBuilder (64);
        for (int j = 0; j < 64; j++){
            b1.append('.');
        }
        for (int i = 0; i < 64; i++) {
            long place = 1L << i;
            if ((place&ships) == place && (place&shots) == place) {
                b1.setCharAt(i, '☒');
            } else if ((place&ships) == place) {
                b1.setCharAt(i, '☐');
            }else if ((place&shots) == place){
                b1.setCharAt(i, '×');
            }
        }
        b1.reverse().insert(8,'\n').insert(17,'\n').insert(26, '\n').
                insert(35, '\n').insert(44,'\n').insert(53,'\n').insert(62,'\n');
        //System.out.println(b1.toString());
        return b1.toString();
    }
}
