package net.aimeizi.action.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import net.aimeizi.model.Category;
import net.aimeizi.model.Product;

/**
 * 商品ActionForm
 *
 * @author scott
 */
@SuppressWarnings("serial")
public class ProductActionForm extends ActionForm {

    private Product product = new Product();

    private Category category = new Category();


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {
        return super.validate(mapping, request);
    }


}
