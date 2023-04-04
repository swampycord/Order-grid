export class order {
    id: number;
    date: Date;
    name: string;
    orderId: number;
    price: number;
    quantity: number;
    total: number;
    constructor(
        id: number,
        date: Date,
        name: string,
        orderId: number,
        price: number,
        quantity: number,
        total: number
    ) {
        this.id = id;
        this.date = date,
            this.name = name,
            this.orderId = orderId,
            this.price = price,
            this.quantity = quantity,
            this.total = total
    }
}