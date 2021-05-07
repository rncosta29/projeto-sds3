import { Seller } from './seller';

export type SaleSum = {
    name: string;
    sum: number;
}

export type SaleSuccess = {
    sellerName: string;
    visited: number;
    deals: number;
}

export type Sale = {
    id: number;
    visited: number;
    deals: number;
    amount: number;
    date: string;
    seller: Seller
}

export type SalePage = {
    content?: Sale[];
    last: boolean;
    totalElements: number;
    totalPages: number;
    size?: number;
    number: number;
    first: true;
    numberOfElements?: number;
    empty?: boolean;
}