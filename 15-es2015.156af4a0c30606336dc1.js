(window.webpackJsonp=window.webpackJsonp||[]).push([[15],{TbC0:function(l,n,u){"use strict";u.r(n);var o=u("8Y7J");class e{}var r=u("pMnS"),t=u("oBZk"),b=u("ZZ/e"),i=u("lGQG");class a{constructor(l,n,u,o){this.modalController=l,this.menu=n,this.authService=u,this.navCtrl=o,this.menu.enable(!1)}ionViewWillEnter(){this.authService.getToken().then(()=>{this.authService.isLoggedIn&&this.navCtrl.navigateRoot("/dashboard")})}ngOnInit(){}}var c=o.pb({encapsulation:0,styles:[[".welcome-card[_ngcontent-%COMP%]   img[_ngcontent-%COMP%]{max-height:35vh;overflow:hidden}"]],data:{}});function s(l){return o.Ib(0,[(l()(),o.rb(0,0,null,null,10,"ion-header",[],null,null,null,t.L,t.l)),o.qb(1,49152,null,0,b.z,[o.h,o.k,o.x],null,null),(l()(),o.rb(2,0,null,0,8,"ion-toolbar",[],null,null,null,t.Z,t.z)),o.qb(3,49152,null,0,b.Ab,[o.h,o.k,o.x],null,null),(l()(),o.rb(4,0,null,0,3,"ion-buttons",[["slot","start"]],null,null,null,t.C,t.c)),o.qb(5,49152,null,0,b.j,[o.h,o.k,o.x],null,null),(l()(),o.rb(6,0,null,0,1,"ion-menu-button",[],null,null,null,t.T,t.u)),o.qb(7,49152,null,0,b.P,[o.h,o.k,o.x],null,null),(l()(),o.rb(8,0,null,0,2,"ion-title",[],null,null,null,t.Y,t.y)),o.qb(9,49152,null,0,b.yb,[o.h,o.k,o.x],null,null),(l()(),o.Hb(-1,0,[" Home "])),(l()(),o.rb(11,0,null,null,51,"ion-content",[],null,null,null,t.J,t.j)),o.qb(12,49152,null,0,b.s,[o.h,o.k,o.x],null,null),(l()(),o.rb(13,0,null,0,14,"ion-card",[["class","welcome-card"]],null,null,null,t.H,t.d)),o.qb(14,49152,null,0,b.k,[o.h,o.k,o.x],null,null),(l()(),o.rb(15,0,null,0,0,"img",[["alt",""],["src","/assets/shapes.svg"]],null,null,null,null,null)),(l()(),o.rb(16,0,null,0,7,"ion-card-header",[],null,null,null,t.E,t.f)),o.qb(17,49152,null,0,b.m,[o.h,o.k,o.x],null,null),(l()(),o.rb(18,0,null,0,2,"ion-card-subtitle",[],null,null,null,t.F,t.g)),o.qb(19,49152,null,0,b.n,[o.h,o.k,o.x],null,null),(l()(),o.Hb(-1,0,["Get Started"])),(l()(),o.rb(21,0,null,0,2,"ion-card-title",[],null,null,null,t.G,t.h)),o.qb(22,49152,null,0,b.o,[o.h,o.k,o.x],null,null),(l()(),o.Hb(-1,0,["Welcome to Ionic"])),(l()(),o.rb(24,0,null,0,3,"ion-card-content",[],null,null,null,t.D,t.e)),o.qb(25,49152,null,0,b.l,[o.h,o.k,o.x],null,null),(l()(),o.rb(26,0,null,0,1,"p",[],null,null,null,null,null)),(l()(),o.Hb(-1,null,["Now that your app has been created, you'll want to start building out features and components. Check out some of the resources below for next steps."])),(l()(),o.rb(28,0,null,0,34,"ion-list",[["lines","none"]],null,null,null,t.S,t.r)),o.qb(29,49152,null,0,b.M,[o.h,o.k,o.x],{lines:[0,"lines"]},null),(l()(),o.rb(30,0,null,0,4,"ion-list-header",[],null,null,null,t.R,t.s)),o.qb(31,49152,null,0,b.N,[o.h,o.k,o.x],null,null),(l()(),o.rb(32,0,null,0,2,"ion-label",[],null,null,null,t.Q,t.q)),o.qb(33,49152,null,0,b.L,[o.h,o.k,o.x],null,null),(l()(),o.Hb(-1,0,["Resources"])),(l()(),o.rb(35,0,null,0,6,"ion-item",[["href","https://ionicframework.com/docs/"]],null,null,null,t.P,t.p)),o.qb(36,49152,null,0,b.F,[o.h,o.k,o.x],{href:[0,"href"]},null),(l()(),o.rb(37,0,null,0,1,"ion-icon",[["color","medium"],["name","book"],["slot","start"]],null,null,null,t.M,t.m)),o.qb(38,49152,null,0,b.A,[o.h,o.k,o.x],{color:[0,"color"],name:[1,"name"]},null),(l()(),o.rb(39,0,null,0,2,"ion-label",[],null,null,null,t.Q,t.q)),o.qb(40,49152,null,0,b.L,[o.h,o.k,o.x],null,null),(l()(),o.Hb(-1,0,["Ionic Documentation"])),(l()(),o.rb(42,0,null,0,6,"ion-item",[["href","https://ionicframework.com/docs/building/scaffolding"]],null,null,null,t.P,t.p)),o.qb(43,49152,null,0,b.F,[o.h,o.k,o.x],{href:[0,"href"]},null),(l()(),o.rb(44,0,null,0,1,"ion-icon",[["color","medium"],["name","build"],["slot","start"]],null,null,null,t.M,t.m)),o.qb(45,49152,null,0,b.A,[o.h,o.k,o.x],{color:[0,"color"],name:[1,"name"]},null),(l()(),o.rb(46,0,null,0,2,"ion-label",[],null,null,null,t.Q,t.q)),o.qb(47,49152,null,0,b.L,[o.h,o.k,o.x],null,null),(l()(),o.Hb(-1,0,["Scaffold Out Your App"])),(l()(),o.rb(49,0,null,0,6,"ion-item",[["href","https://ionicframework.com/docs/layout/structure"]],null,null,null,t.P,t.p)),o.qb(50,49152,null,0,b.F,[o.h,o.k,o.x],{href:[0,"href"]},null),(l()(),o.rb(51,0,null,0,1,"ion-icon",[["color","medium"],["name","grid"],["slot","start"]],null,null,null,t.M,t.m)),o.qb(52,49152,null,0,b.A,[o.h,o.k,o.x],{color:[0,"color"],name:[1,"name"]},null),(l()(),o.rb(53,0,null,0,2,"ion-label",[],null,null,null,t.Q,t.q)),o.qb(54,49152,null,0,b.L,[o.h,o.k,o.x],null,null),(l()(),o.Hb(-1,0,["Change Your App Layout"])),(l()(),o.rb(56,0,null,0,6,"ion-item",[["href","https://ionicframework.com/docs/theming/basics"]],null,null,null,t.P,t.p)),o.qb(57,49152,null,0,b.F,[o.h,o.k,o.x],{href:[0,"href"]},null),(l()(),o.rb(58,0,null,0,1,"ion-icon",[["color","medium"],["name","color-fill"],["slot","start"]],null,null,null,t.M,t.m)),o.qb(59,49152,null,0,b.A,[o.h,o.k,o.x],{color:[0,"color"],name:[1,"name"]},null),(l()(),o.rb(60,0,null,0,2,"ion-label",[],null,null,null,t.Q,t.q)),o.qb(61,49152,null,0,b.L,[o.h,o.k,o.x],null,null),(l()(),o.Hb(-1,0,["Theme Your App"]))],(function(l,n){l(n,29,0,"none"),l(n,36,0,"https://ionicframework.com/docs/"),l(n,38,0,"medium","book"),l(n,43,0,"https://ionicframework.com/docs/building/scaffolding"),l(n,45,0,"medium","build"),l(n,50,0,"https://ionicframework.com/docs/layout/structure"),l(n,52,0,"medium","grid"),l(n,57,0,"https://ionicframework.com/docs/theming/basics"),l(n,59,0,"medium","color-fill")}),null)}function h(l){return o.Ib(0,[(l()(),o.rb(0,0,null,null,1,"app-home",[],null,null,null,s,c)),o.qb(1,114688,null,0,a,[b.Fb,b.Eb,i.a,b.Gb],null,null)],(function(l,n){l(n,1,0)}),null)}var m=o.nb("app-home",a,h,{},{},[]),d=u("SVse"),k=u("s7LF"),f=u("iInd");u.d(n,"HomePageModuleNgFactory",(function(){return p}));var p=o.ob(e,[],(function(l){return o.zb([o.Ab(512,o.j,o.Z,[[8,[r.a,m]],[3,o.j],o.v]),o.Ab(4608,d.k,d.j,[o.s,[2,d.q]]),o.Ab(4608,k.j,k.j,[]),o.Ab(4608,b.a,b.a,[o.x,o.g]),o.Ab(4608,b.Fb,b.Fb,[b.a,o.j,o.p]),o.Ab(4608,b.Jb,b.Jb,[b.a,o.j,o.p]),o.Ab(1073742336,d.b,d.b,[]),o.Ab(1073742336,k.i,k.i,[]),o.Ab(1073742336,k.b,k.b,[]),o.Ab(1073742336,b.Cb,b.Cb,[]),o.Ab(1073742336,f.o,f.o,[[2,f.t],[2,f.m]]),o.Ab(1073742336,e,e,[]),o.Ab(1024,f.k,(function(){return[[{path:"",component:a}]]}),[])])}))}}]);