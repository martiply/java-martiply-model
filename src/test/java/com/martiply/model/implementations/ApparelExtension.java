package com.martiply.model.implementations;

import com.martiply.model.interfaces.IApparelExtension;

public class ApparelExtension implements IApparelExtension {

    String id;
    String groupId;
    Gender gender;
    Age age;
    String sizeSystem;
    String size;
    String color;
    String material;
    String feature;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public void setAge(Age age) {
        this.age = age;
    }

    @Override
    public Age getAge() {
        return this.age;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setSizeSystem(String sizeSystem) {
        this.sizeSystem = sizeSystem;
    }

    public String getSizeSystem() {
        return sizeSystem;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }




    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
