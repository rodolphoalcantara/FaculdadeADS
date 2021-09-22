import * as React from 'react';
import {
  Text,
  View,
  TouchableOpacity,
  FlatList,
  Modal,
  Pressable,
  StyleSheet,
} from 'react-native';
import Constants from 'expo-constants';

// You can import from local files
import AssetExample from './components/AssetExample';

// or any pure javascript modules available in npm
import { Card } from 'react-native-paper';

const ShowHelp = ({ display, toogleModal, mensagem }) => (
  <Modal
    animationType="slide"
    transparent={true}
    visible={display}
    onRequestClose={toogleModal}>
    <View style={styles.centeredView}>
      <View style={styles.modalView}>
        <Pressable onPress={toogleModal}>
          <Text>{mensagem}</Text>
        </Pressable>
      </View>
    </View>
  </Modal>
);

const BotaoHelp = () => {
  const mensagemAjuda =
    'Mensagem de Ajuda ! \n\n\nADO Desenvolvida pelo aluno\nRodolpho Ramos de Alcântara';
  const [modal, setModal] = React.useState(false);

  function mudaModal() {
    setModal(!modal);
  }

  return (
    <View style={styles.containerButton}>
      <ShowHelp
        display={modal}
        toogleModal={mudaModal}
        mensagem={mensagemAjuda}
      />
      <TouchableOpacity style={styles.buttonHelp} onPress={mudaModal}>
        <Text>?</Text>
      </TouchableOpacity>
    </View>
  );
};

async function getCor(url, jsonState){

  await fetch(url).then(res => {
    if(res.status === 200){
      res.json().then(function(result){
        jsonState(result);
      })
    }else{
      throw new Error('Erro ao tentar consumir a API');
    }
  }).then(res => {

  }).catch(erro => console.error(erro))

}

const Cor = ({ nome, hex }) => {

  return (
    <View style={styles.card, {backgroundColor: hex}}>
      <View style={styles.cardContent} >
        <Text style={styles.titulo}>{nome}</Text>
      </View>
    </View>
  );
};

export default function App() {

  const [jsonData, setJsonData] = React.useState({});

  getCor("https://reqres.in/api/unknown", setJsonData);

  function meuItem({ item }) {
    return (
      <Cor nome={item.name} hex={item.color} />
    );
  }

  const ListHeader = () => {
    return (
      <View style={styles.headerFooterStyle}>
        <Text style={styles.h1}>
            Cores do reqres
        </Text>
      </View>
    );
  };

  return (
    <View style={styles.screen}>
      <BotaoHelp />
      <FlatList
        ListHeaderComponent={ListHeader}
        data={jsonData.data}
        renderItem={meuItem}
        keyExtractor={(item) => item.id}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  screen: {
    flex: 1,
    justifyContent: 'center',
    paddingTop: Constants.statusBarHeight,
    backgroundColor: '#ecf0f1',
    padding: 8,
  },
  containerButton: {
    margin: 24,
    paddingBottom: 40,
    fontSize: 18,
    flex: 1,
    alignSelf: 'flex-end',
  },
  buttonHelp: {
    width: 30,
    height: 30,
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 100,
    borderWidth: 1.25,
    backgroundColor: '#ccc',
  },
  modalView: {
    margin: 20,
    backgroundColor: 'white',
    borderRadius: 20,
    padding: 35,
    alignItems: 'center',
    shadowColor: '#000',
    shadowOffset: {
      width: 0,
      height: 2,
    },
    shadowOpacity: 0.25,
    shadowRadius: 4,
    elevation: 5,
  },
  centeredView: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  card: {
    padding: 16,
    borderRadius: 6,
    elevation: 3,
    shadowOffset: { width: 1, height: 1 },
    shadowColor: '#333',
    shadowOpacity: 0.3,
    shadowRadius: 2,
    marginHorizontal: 4,
    marginVertical: 6,
  },
  cardContent: {
    height: 50,
    alignSelf:"center",
    marginHorizontal: 18,
    marginVertical: 10,
  },
  titulo: {
    fontSize: 18,
    fontWeight: 'bold',
  },
  h1:{
    fontSize:24,
    fontWeight: 'bold',
    padding: 8,
  }
});
