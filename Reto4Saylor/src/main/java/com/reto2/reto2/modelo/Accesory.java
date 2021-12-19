package com.reto2.reto2.modelo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Brayand Fuyo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "footwears")
public class Accesory implements Serializable{
@Id
private String reference;

private String brand;
private String category;
private String material;
private String gender;
private String size;
private String description;
private boolean availability = true;
private double price;
private int quantity;
private String photography;

// public Footwear() {
// }

// public Footwear(String reference, String brand, String category, String material, String gender, String size,
//         String description, boolean availability, double price, int quantity, String photography) {
//     this.reference = reference;
//     this.brand = brand;
//     this.category = category;
//     this.material = material;
//     this.gender = gender;
//     this.size = size;
//     this.description = description;
//     this.availability = availability;
//     this.price = price;
//     this.quantity = quantity;
//     this.photography = photography;
// }

// public String getReference() {
//     return reference;
// }

// public void setReference(String reference) {
//     this.reference = reference;
// }

// public String getBrand() {
//     return brand;
// }

// public void setBrand(String brand) {
//     this.brand = brand;
// }

// public String getCategory() {
//     return category;
// }

// public void setCategory(String category) {
//     this.category = category;
// }

// public String getMaterial() {
//     return material;
// }

// public void setMaterial(String material) {
//     this.material = material;
// }

// public String getGender() {
//     return gender;
// }

// public void setGender(String gender) {
//     this.gender = gender;
// }

// public String getSize() {
//     return size;
// }

// public void setSize(String size) {
//     this.size = size;
// }

// public String getDescription() {
//     return description;
// }

// public void setDescription(String description) {
//     this.description = description;
// }

// public boolean isAvailability() {
//     return availability;
// }

// public void setAvailability(boolean availability) {
//     this.availability = availability;
// }

// public double getPrice() {
//     return price;
// }

// public void setPrice(double price) {
//     this.price = price;
// }

// public int getQuantity() {
//     return quantity;
// }

// public void setQuantity(int quantity) {
//     this.quantity = quantity;
// }

// public String getPhotography() {
//     return photography;
// }

// public void setPhotography(String photography) {
//     this.photography = photography;
// }


}
