package com.example.tacofighter.mydesign.data;

import java.util.ArrayList;

/**
 * Created by TacoFighter on 2018/1/28.
 */

public interface TripDAO {
    public boolean add(trip trip);
    public ArrayList<trip> getList();
    public trip gettrip(int id);
    public boolean update(trip t);
    public boolean delete(int id);
}
