package com.houseoffourleaf.ecommerce.mapper;

import com.houseoffourleaf.ecommerce.dto.OfferDTO;
import com.houseoffourleaf.ecommerce.entity.Offer;

public class OfferMapper {

    public static OfferDTO toDTO(Offer offer) {
        OfferDTO offerDTO = new OfferDTO();
        offerDTO.setId(offer.getId());
        offerDTO.setCode(offer.getCode());
        offerDTO.setStartDate(offer.getStartDate());
        offerDTO.setEndDate(offer.getEndDate());
        offerDTO.setDiscountType(offer.getDiscountType());
        offerDTO.setDiscountAmount(offer.getDiscountAmount());
        offerDTO.setDiscountPercentage(offer.getDiscountPercentage());
        offerDTO.setActiveInd(offer.getActiveInd());
        // You can map other fields as needed
        return offerDTO;
    }

    public static Offer toEntity(OfferDTO offerDTO) {
        Offer offer = new Offer();
        offer.setId(offerDTO.getId());
        offer.setCode(offerDTO.getCode());
        offer.setStartDate(offerDTO.getStartDate());
        offer.setEndDate(offerDTO.getEndDate());
        offer.setDiscountType(offerDTO.getDiscountType());
        offer.setDiscountAmount(offerDTO.getDiscountAmount());
        offer.setDiscountPercentage(offerDTO.getDiscountPercentage());
        offer.setActiveInd(offerDTO.getActiveInd());
        // You can map other fields as needed
        return offer;
    }

}
