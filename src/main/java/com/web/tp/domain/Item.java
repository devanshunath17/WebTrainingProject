package com.web.tp.service.dto;

import com.web.tp.domain.AbstractAuditingEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@org.springframework.data.mongodb.core.mapping.Document(collection = "Item")
public class Item extends AbstractAuditingEntity implements Serializable {
    @Id
    @Field("catId")
    private String catId;
    @NotNull
    @Field("catName")
    private String catName;
    @NotNull
    @Field("itemId")
    private String itemId;
    @Field("companyName")
    private String companyName;
    @Field("price")
    private String price;
    @Field("entryDate")
    private String entryDate;
    @Field("exitdate")
    private String exitdate;

    public Item(String catId, @NotNull String catName, @NotNull String itemId, String companyName, String price, String entryDate, String exitdate) {
        this.catId = catId;
        this.catName = catName;
        this.itemId = itemId;
        this.companyName = companyName;
        this.price = price;
        this.entryDate = entryDate;
        this.exitdate = exitdate;
    }

    public Item() {
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getExitdate() {
        return exitdate;
    }

    public void setExitdate(String exitdate) {
        this.exitdate = exitdate;
    }

    @Override
    public String toString() {
        return "Item{" +
            "catId='" + catId + '\'' +
            ", catName='" + catName + '\'' +
            ", itemId='" + itemId + '\'' +
            ", companyName='" + companyName + '\'' +
            ", price='" + price + '\'' +
            ", entryDate='" + entryDate + '\'' +
            ", exitdate='" + exitdate + '\'' +
            '}';
    }
}
