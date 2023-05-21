package hello.proxy.app.v1;

public class OrderServiceImplV1 implements OrderServiceV1{
    private final OrderRepositoryV1 orderRepositoryV1;

    public OrderServiceImplV1(OrderRepositoryV1 orderRepositoryV1) {
        this.orderRepositoryV1 = orderRepositoryV1;
    }

    @Override
    public void orderItem(String itemId) {
        orderRepositoryV1.save(itemId);
    }
}
