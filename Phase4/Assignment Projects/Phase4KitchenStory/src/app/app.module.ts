import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';

import { HttpClientModule } from '@angular/common/http';
import { FoodListComponent } from './components/food-list/food-list.component';
import { AddFoodComponent } from './components/add-food/add-food.component';
import { RemoveFoodComponent } from './components/remove-food/remove-food.component';
import { FoodSearchComponent } from './components/food-search/food-search.component';
import { AddFoodToCartComponent } from './components/add-food-to-cart/add-food-to-cart.component';
import { ViewCartComponent } from './components/view-cart/view-cart.component';
import { CheckoutComponent } from './components/checkout/checkout.component';
import { PaymentComponent } from './components/payment/payment.component';
import { OrderConfirmationComponent } from './components/order-confirmation/order-confirmation.component';
import { FoodService } from './services/food.service';
import { CartService } from './services/cart.service';
import { PaymentService } from './services/payment.service';
import { UserService } from './services/user.service';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FoodListComponent,
    AddFoodComponent,
    RemoveFoodComponent,
    FoodSearchComponent,
    AddFoodToCartComponent,
    ViewCartComponent,
    CheckoutComponent,
    PaymentComponent,
    OrderConfirmationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [CartService, FoodService, PaymentService, UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
