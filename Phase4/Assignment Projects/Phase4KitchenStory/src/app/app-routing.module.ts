import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddFoodToCartComponent } from './components/add-food-to-cart/add-food-to-cart.component';
import { AddFoodComponent } from './components/add-food/add-food.component';
import { CheckoutComponent } from './components/checkout/checkout.component';
import { FoodListComponent } from './components/food-list/food-list.component';
import { FoodSearchComponent } from './components/food-search/food-search.component';
import { OrderConfirmationComponent } from './components/order-confirmation/order-confirmation.component';
import { PaymentComponent } from './components/payment/payment.component';
import { RemoveFoodComponent } from './components/remove-food/remove-food.component';
import { ViewCartComponent } from './components/view-cart/view-cart.component';

const routes: Routes = [
  {path:"", redirectTo:'/home', pathMatch:'full'},
  {path:"food-list", component:FoodListComponent},
  {path:"add-food", component:AddFoodComponent},
  {path:"remove-food", component:RemoveFoodComponent},
  {path:"food-search", component:FoodSearchComponent},
  {path:"add-food-to-cart", component:AddFoodToCartComponent},
  {path:"view-cart", component:ViewCartComponent},
  {path:"checkout", component:CheckoutComponent},
  {path:"payment", component:PaymentComponent},
  {path:"order-confirmation", component:OrderConfirmationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
