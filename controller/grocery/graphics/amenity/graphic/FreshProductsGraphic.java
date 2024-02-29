package com.socialsim.controller.grocery.graphics.amenity.graphic;

import com.socialsim.controller.grocery.graphics.amenity.GroceryAmenityGraphic;
import com.socialsim.model.core.environment.grocery.patchobject.passable.goal.FreshProducts;

public class FreshProductsGraphic extends GroceryAmenityGraphic {

    private static final int ROW_SPAN = 2;
    private static final int COLUMN_SPAN = 2;

    private static final int NORMAL_ROW_OFFSET = 0;
    private static final int NORMAL_COLUMN_OFFSET = 0;

    public FreshProductsGraphic(FreshProducts freshProducts) {
        super(freshProducts, ROW_SPAN, COLUMN_SPAN, NORMAL_ROW_OFFSET, NORMAL_COLUMN_OFFSET);
    }

}