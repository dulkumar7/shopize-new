package com.shopizer.shop.services.taxservice.model;

import com.shopizer.shop.services.taxservice.constants.TaxServiceConstants;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_DESCRIPTION", schema = TaxServiceConstants.DB_SCHEMA_NAME, uniqueConstraints={
        @UniqueConstraint(columnNames={
                "PRODUCT_ID",
                "LANGUAGE_ID"
        })
}
)
public class ProductDescription extends Description {
    private static final long serialVersionUID = -7991123535661321865L;

    @ManyToOne(targetEntity = Product.class)
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    private Product product;

    @Column(name = "PRODUCT_HIGHLIGHT")
    private String productHighlight;

    @Column(name = "DOWNLOAD_LNK")
    private String productExternalDl;

    @Column(name = "SEF_URL")
    private String seUrl;

    @Column(name = "META_TITLE")
    private String metatagTitle;

    @Column(name = "META_KEYWORDS")
    private String metatagKeywords;

    @Column(name = "META_DESCRIPTION")
    private String metatagDescription;

    public ProductDescription() {
    }

    public String getProductHighlight() {
        return productHighlight;
    }

    public void setProductHighlight(String productHighlight) {
        this.productHighlight = productHighlight;
    }

    public String getProductExternalDl() {
        return productExternalDl;
    }

    public void setProductExternalDl(String productExternalDl) {
        this.productExternalDl = productExternalDl;
    }

    public String getSeUrl() {
        return seUrl;
    }

    public void setSeUrl(String seUrl) {
        this.seUrl = seUrl;
    }

    public String getMetatagTitle() {
        return metatagTitle;
    }

    public void setMetatagTitle(String metatagTitle) {
        this.metatagTitle = metatagTitle;
    }

    public String getMetatagKeywords() {
        return metatagKeywords;
    }

    public void setMetatagKeywords(String metatagKeywords) {
        this.metatagKeywords = metatagKeywords;
    }

    public String getMetatagDescription() {
        return metatagDescription;
    }

    public void setMetatagDescription(String metatagDescription) {
        this.metatagDescription = metatagDescription;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}