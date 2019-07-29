import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './Components/home/home.component';
import { HomeService } from './Services/home.service';
import { HttpClientModule } from '@angular/common/http';
7
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],

  providers: [HomeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
