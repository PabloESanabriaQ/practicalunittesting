package com.pabloesanabriaq.practicalunittesting.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Client {

    private List<Address> addresses;

    public Client(){
        this.addresses = new ArrayList<>();
    }

    public void addAddress(Address address){
        this.addresses.add(address);
    }
}
