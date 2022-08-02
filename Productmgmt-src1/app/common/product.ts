export class Product {
    constructor(public id : number,
                public sku : number,
                public name : string,
                public description : string,
                public unitPrice : number,
                public imageUrl : string,
                public active: number,
                public unitsInStock : number,
                public dateCreated : string,
                public lastUpdated : string,
                public categoryId : number) {}
}
