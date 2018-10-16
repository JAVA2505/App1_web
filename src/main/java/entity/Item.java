package entity;

import java.util.Objects;

public class Item {
    private int id;
    private String name;
    private String img;
    private String sImg;
    private int price;
    private String cat;
    private String about;

    public Item() {
    }

    public Item(int id, String name, String img, String sImg, int price, String cat, String about) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.sImg = sImg;
        this.price = price;
        this.cat = cat;
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getsImg() {
        return sImg;
    }

    public void setsImg(String sImg) {
        this.sImg = sImg;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.id;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + Objects.hashCode(this.img);
        hash = 73 * hash + Objects.hashCode(this.sImg);
        hash = 73 * hash + this.price;
        hash = 73 * hash + Objects.hashCode(this.cat);
        hash = 73 * hash + Objects.hashCode(this.about);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.img, other.img)) {
            return false;
        }
        if (!Objects.equals(this.sImg, other.sImg)) {
            return false;
        }
        if (!Objects.equals(this.cat, other.cat)) {
            return false;
        }
        return Objects.equals(this.about, other.about);
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name=" + name + ", img=" + img + ", sImg=" + sImg + ", price=" + price + ", cat=" + cat + ", about=" + about + '}';
    }

}
