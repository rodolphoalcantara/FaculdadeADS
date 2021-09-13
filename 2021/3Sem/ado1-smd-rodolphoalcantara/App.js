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

const DATA = [
  {
    postId: 1,
    id: 1,
    name: 'id labore ex et quam laborum',
    email: 'Eliseo@gardner.biz',
    body:
      'laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium',
  },
  {
    postId: 1,
    id: 2,
    name: 'quo vero reiciendis velit similique earum',
    email: 'Jayne_Kuhic@sydney.com',
    body:
      'est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et',
  },
  {
    postId: 1,
    id: 3,
    name: 'odio adipisci rerum aut animi',
    email: 'Nikita@garfield.biz',
    body:
      'quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione',
  },
  {
    postId: 1,
    id: 4,
    name: 'alias odio sit',
    email: 'Lew@alysha.tv',
    body:
      'non et atque\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut occaecati',
  },
  {
    postId: 1,
    id: 5,
    name: 'vero eaque aliquid doloribus et culpa',
    email: 'Hayden@althea.biz',
    body:
      'harum non quasi et ratione\ntempore iure ex voluptates in ratione\nharum architecto fugit inventore cupiditate\nvoluptates magni quo et',
  },
  {
    postId: 2,
    id: 6,
    name: 'et fugit eligendi deleniti quidem qui sint nihil autem',
    email: 'Presley.Mueller@myrl.com',
    body:
      'doloribus at sed quis culpa deserunt consectetur qui praesentium\naccusamus fugiat dicta\nvoluptatem rerum ut voluptate autem\nvoluptatem repellendus aspernatur dolorem in',
  },
  {
    postId: 2,
    id: 7,
    name: 'repellat consequatur praesentium vel minus molestias voluptatum',
    email: 'Dallas@ole.me',
    body:
      'maiores sed dolores similique labore et inventore et\nquasi temporibus esse sunt id et\neos voluptatem aliquam\naliquid ratione corporis molestiae mollitia quia et magnam dolor',
  },
  {
    postId: 2,
    id: 8,
    name: 'et omnis dolorem',
    email: 'Mallory_Kunze@marie.org',
    body:
      'ut voluptatem corrupti velit\nad voluptatem maiores\net nisi velit vero accusamus maiores\nvoluptates quia aliquid ullam eaque',
  },
  {
    postId: 2,
    id: 9,
    name: 'provident id voluptas',
    email: 'Meghan_Littel@rene.us',
    body:
      'sapiente assumenda molestiae atque\nadipisci laborum distinctio aperiam et ab ut omnis\net occaecati aspernatur odit sit rem expedita\nquas enim ipsam minus',
  },
  {
    postId: 2,
    id: 10,
    name: 'eaque et deleniti atque tenetur ut quo ut',
    email: 'Carmen_Keeling@caroline.name',
    body:
      'voluptate iusto quis nobis reprehenderit ipsum amet nulla\nquia quas dolores velit et non\naut quia necessitatibus\nnostrum quaerat nulla et accusamus nisi facilis',
  },
];

const Comentario = ({ email, titulo, corpo }) => {
  return (
    <View style={styles.card}>
      <View syle={styles.cardContent}>
        <Text style={styles.email}>{email}</Text>
        <Text style={styles.titulo}>{titulo}</Text>
        <Text style={styles.corpo}>{corpo}</Text>
      </View>
    </View>
  );
};

export default function App() {
  function meuItem({ item }) {
    return (
      <Comentario email={item.email} titulo={item.name} corpo={item.body} />
    );
  }

  return (
    <View style={styles.screen}>
      <BotaoHelp />
      <Text style={styles.h1}>Comentários</Text>
      <FlatList
        data={DATA}
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
    backgroundColor: '#fff',
    shadowOffset: { width: 1, height: 1 },
    shadowColor: '#333',
    shadowOpacity: 0.3,
    shadowRadius: 2,
    marginHorizontal: 4,
    marginVertical: 6,
  },
  cardContent: {
    marginHorizontal: 18,
    marginVertical: 10,
  },
  email: {
    color: '#ccc',
    fontSize: 10,
    fontStyle: 'italic',
  },
  titulo: {
    fontSize: 18,
    fontWeight: 'bold',
  },
  corpo: {
    fontSize: 12,
  },
  h1:{
    fontSize:24,
    fontWeight: 'bold',
    padding: 8,
  }
});
