import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { LoginPage } from '../login/login.page';
import { ModalController, MenuController, NavController } from '@ionic/angular';

@Component({
  selector: 'app-login',
  templateUrl: 'registration.page.html',
  styleUrls: ['registration.page.scss'],
})
export class RegistrationPage implements OnInit {

  constructor(private modalController: ModalController,
    private menu: MenuController,
    private navCtrl: NavController) {

  }

  ngOnInit() {

  }

  // Dismiss Register Modal
  dismissRegister() {
    this.modalController.dismiss();
  }

  // On Login button tap, dismiss Register modal and open login Modal
  async login() {
    this.dismissRegister();
    const loginModal = await this.modalController.create({
      component: LoginPage
    });
    return await loginModal.present();
  }

}
