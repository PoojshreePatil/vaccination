package com.assesment.vaccination.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userinfo")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    private String id_Detail;
    private String id_Number;
    private String name;
    private String contact;
    private String vaccinename;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getId_Detail() {
        return id_Detail;
    }

    public void setId_Detail(String id_Detail) {
        this.id_Detail = id_Detail;
    }

    public String getId_Number() {
        return id_Number;
    }

    public void setId_Number(String id_Number) {
        this.id_Number = id_Number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getVaccinename() {
        return vaccinename;
    }

    public void setVaccinename(String vaccinename) {
        this.vaccinename = vaccinename;
    }

    @Override
    public String toString() {
        return "user [uid=" + uid + ", id_Detail=" + id_Detail + ", id_Number=" + id_Number + ", name=" + name
                + ", contact=" + contact + ", vaccinename=" + vaccinename + "]";
    }

}
