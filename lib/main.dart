import 'package:flutter/material.dart';
import 'package:pic2alert/src/global_bloc.dart';
import 'package:pic2alert/src/ui/homepage/homepage.dart';
import 'package:provider/provider.dart';

void main() {
  runApp(Pic2Alert());
}

class Pic2Alert extends StatefulWidget {
  @override
  _Pic2AlertState createState() => _Pic2AlertState();
}

class _Pic2AlertState extends State<Pic2Alert> {
  GlobalBloc globalBloc;

  void initState() {
    globalBloc = GlobalBloc();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Provider<GlobalBloc>.value(
      value: globalBloc,
      child: MaterialApp(
        theme: ThemeData(
          primarySwatch: Colors.green,
          brightness: Brightness.light,
        ),
        home: HomePage(),
        debugShowCheckedModeBanner: false,
      ),
    );
  }
}
