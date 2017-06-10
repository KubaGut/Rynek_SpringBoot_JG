package com.example.service;


import com.example.model.Shop;
import com.example.repository.CustomerRepository;
import com.example.repository.OrderRepository;
import com.example.repository.ProductRepository;
import com.example.repository.ShopRepository;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class MainServiceTest {

    /*
    ShopRepository shopRepository;
    ProductRepository productRepository;
    OrderRepository orderRepository;
    CustomerRepository customerRepository;

    MainService mainService;

    @Before
    public void setUp() {
        shopRepository = mock(shopRepository.getClass());
        productRepository = mock(productRepository.getClass());
        orderRepository = mock(orderRepository.getClass());
        customerRepository = mock(customerRepository.getClass());

        mainService = new MainService(shopRepository, productRepository, orderRepository, customerRepository);

        when(bookRepository.findAll()).thenReturn(
                Lists.newArrayList(
                        new Book("1","title1", "autor1"),
                        new Book("2","title2", "autor2")
                )
        );
    }

    @Test
    public void getListingData() throws Exception {
        // given

        // when
        BookListing bookListing = bookService.getListingData();

        // then
        assertEquals(
                new BookListing(
                        Lists.newArrayList(
                                new Book("1","title1", "autor1"),
                                new Book("2", "title2", "autor2")
                        ),
                        2
                ),
                bookListing);
        verify(bookRepository).findAll();
    }

}
*/
}
